for i in *; do
name ="${i%.*}"
mkdir "$name"
mv "$i" "$name"
done