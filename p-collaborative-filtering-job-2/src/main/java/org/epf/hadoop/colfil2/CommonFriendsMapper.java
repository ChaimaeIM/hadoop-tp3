package org.epf.hadoop.colfil2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.HashSet;

public class CommonFriendsMapper extends Mapper<LongWritable, Text, UserPair, Text> {

    private UserPair userPair = new UserPair();
    private Text relation = new Text();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] parts = value.toString().split("\\s+");
        if (parts.length != 2) {
            return;
        }

        String user = parts[0];
        String[] friends = parts[1].split(",");

        HashSet<String> friendSet = new HashSet<>();
        for (String friend : friends) {
            friendSet.add(friend);
        }

        for (String friend1 : friends) {
            for (String friend2 : friends) {
                if (!friend1.equals(friend2)) {
                    userPair = new UserPair(friend1, friend2);
                    relation.set(user);
                    context.write(userPair, relation);
                }
            }
        }
    }
}
