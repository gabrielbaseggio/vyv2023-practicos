fullclassname=$1
bounds=$2
file_name=$3
packagename=${fullclassname%\.*}
classname=${fullclassname##*\.}
repok=$4

compile_cmd="javac -cp libs/korat+.jar -target 1.5  -source 1.5 -d target/classes/ src/main/java/$packagename/*.java"
bash -c "$compile_cmd"

finitization_method=fin$classname


cmd="java -cp libs/korat+.jar:target/classes/:libs/ korat.Korat --class $fullclassname  --args $bounds --finitization $finitization_method --predicate $repok --visualize --serialize $file_name"

bash -c "$cmd"

