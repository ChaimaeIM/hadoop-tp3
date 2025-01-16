cd /root/p-collaborative-filtering-job-1/src/main/java/org/epf/hadoop/colfil1
javac -classpath /root/hadoop/tar/hadoop-3.2.1/share/hadoop/common/*:/root/hadoop/tar/hadoop-3.2.1/share/hadoop/mapreduce/*:/root/hadoop/tar/hadoop-3.2.1/share/hadoop/hdfs/* -d /root/p-collaborative-filtering-job-1/target /root/p-collaborative-filtering-job-1/src/main/java/org/epf/hadoop/colfil1/*.java
cd /root/p-collaborative-filtering-job-1/target
jar cvf /root/jars/tpfinal-Chaimae_IMRANI_job1.jar -C /root/p-collaborative-filtering-job-1/target .
 cd /root/p-collaborative-filtering-job-1/src/main/java/org/epf/hadoop/colfil1
 cd /root/p-collaborative-filtering-job-2/src/main/java/org/epf/hadoop/colfil2
javac -classpath /root/hadoop/tar/hadoop-3.2.1/share/hadoop/common/*:/root/hadoop/tar/hadoop-3.2.1/share/hadoop/mapreduce/*:/root/hadoop/tar/hadoop-3.2.1/share/hadoop/hdfs/* -d /root/p-collaborative-filtering-job-2/target /root/p-collaborative-filtering-job-1/src/main/java/org/epf/hadoop/colfil2/*.java
jar cvf /root/jars/tpfinal-Chaimae_IMRANI_job2.jar -C /root/p-collaborative-filtering-job-2/target .
javac -classpath /root/hadoop/tar/hadoop-3.2.1/share/hadoop/common/*:/root/hadoop/tar/hadoop-3.2.1/share/hadoop/mapreduce/*:/root/hadoop/tar/hadoop-3.2.1/share/hadoop/hdfs/* -d /root/p-collaborative-filtering-job-2/target /root/p-collaborative-filtering-job-2/src/main/java/org/epf/hadoop/colfil2/*.java
cd /root/p-collaborative-filtering-job-2/target
jar cvf /root/jars/tpfinal-Chaimae_IMRANI_job2.jar -C /root/p-collaborative-filtering-job-2/target .
cd /root/p-collaborative-filtering-job-2/target
jar cvf /root/jars/tpfinal-Chaimae_IMRANI_job2.jar -C /root/p-collaborative-filtering-job-2/target .
cd /root/p-collaborative-filtering-job-2/target
jar cvf /root/jars/tpfinal-Chaimae_IMRANI_job2.jar -C /root/p-collaborative-filtering-job-2/target .
