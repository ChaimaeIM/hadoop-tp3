package org.epf.hadoop.colfil2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.HashSet;

public class CommonFriendsReducer extends Reducer<UserPair, Text, UserPair, Text> {

    private Text commonCount = new Text();

    @Override
    protected void reduce(UserPair key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        HashSet<String> uniqueRelations = new HashSet<>();
        boolean hasDirectRelation = false;

        for (Text value : values) {
            String relation = value.toString();
            if (relation.equals(key.getFirstUser()) || relation.equals(key.getSecondUser())) {
                hasDirectRelation = true;
            } else {
                uniqueRelations.add(relation);
            }
        }

        if (!hasDirectRelation && !uniqueRelations.isEmpty()) {
            commonCount.set(String.valueOf(uniqueRelations.size()));
            context.write(key, commonCount);
        }
    }
}
