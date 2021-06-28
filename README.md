# snap-light-demo

•	Snap-light-demo is a demonstrator project for snap-engine-light and s1tx-light. 
It replicates the GPT.exe
Example call:
Java –jar –Xmx5G snap-light-demo-10.0.0-SNAPSHOT.jar myGraph.xml S1A_IW_GRDH_1SDV_20210404T174954_20210404T175019_037304_046525_7946.zip

The maven-jar-plugin in the pom.xml is configured to add the classpath in the manifest configuration with prefix lib. Thus, all the libraries required by the demo are collected from the lib folder.

