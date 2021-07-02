# snap-light-demo

•	Snap-light-demo is a demonstrator project for snap-engine-light and s1tx-light. 
It replicates the GPT.exe

The projects contains:

* The main file in src/main/java/org/esa/snap/snap/light/demo
* lib folder with all the required jar libraries from snap-engine and s1tbx
* snap-light-demo-10.0.0-SNAPSHOT.jar jar file for running the demo 
* A Dockerfile for running a test
* sentinel1_sample with a test graph and a small sentinel1 data sample

For re-creating the lib folder, you need to build 
* https://github.com/ecatixtsc/snap-engine-light
* https://github.com/ecatixtsc/s1tbx-light


Example call:

java -jar -Xmx5G snap-light-demo-10.0.0-SNAPSHOT.jar ./sentinel1_sample/myGraph.xml ./sentinel1_sample/S1A_S4_GRDH_1SDV_20210115T183623_20210115T183632_036152_043D26_F103.zip

The maven-jar-plugin in the pom.xml is configured to add the classpath in the manifest configuration with prefix lib. Thus, all the libraries required by the demo are collected from the lib folder.

