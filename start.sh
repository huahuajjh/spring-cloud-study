#/bin/bash
echo entering myeureka

cd myeureka
echo current pwd is: $(pwd)
nohup mvn spring-boot:run &
echo myeureka started
echo leaving: $(pwd)
cd ..

echo entering calc
cd calc
echo current pwd is: $(pwd)
nohup mvn spring-boot:run &
echo calc started
echo leaving: $(pwd)
cd ..

echo entering calc1
cd calc1
echo current pwd is: $(pwd)
nohup  mvn spring-boot:run &
echo calc1 started
echo leaving: $(pwd)
cd ..

echo entering consumecalc
cd consumecalc
nohup mvn spring-boot:run &
echo consumecalc started
echo leaving: $(pwd)
cd ..