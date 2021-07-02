FROM adoptopenjdk/openjdk11:ubi
RUN mkdir /snap-light-demo
ADD snap-light-demo-10.0.0-SNAPSHOT.jar /snap-light-demo
ADD /lib/* /snap-light-demo/lib/
ADD /sentinel1_sample/* /snap-light-demo/sentinel1_sample/
WORKDIR /snap-light-demo
RUN ls -lrt 
CMD ["java", "-jar", "-Xmx5G", "snap-light-demo-10.0.0-SNAPSHOT.jar", "./sentinel1_sample/myGraph.xml", "./sentinel1_sample/S1A_S4_GRDH_1SDV_20210115T183623_20210115T183632_036152_043D26_F103.zip"]