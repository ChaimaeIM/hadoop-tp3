package org.epf.hadoop.colfil1;

import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

public class RelationshipInputFormat extends FileInputFormat<LongWritable, Relationship> {

    @Override
    public RecordReader<LongWritable, Relationship> createRecordReader(InputSplit split, JobContext context)
            throws IOException, InterruptedException {
        return new RelationshipRecordReader();
    }
}
