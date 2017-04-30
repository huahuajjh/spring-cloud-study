#/bin/bash

pids=$(pgrep java)

for i in $pids
do
kill $i
done