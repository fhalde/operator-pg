```
you can run it locally on a kind/minikube cluster
mvn package
k create -f target/classes/META-INF/fabric8/helloworlds.hello.world-v1.yml

first try creating
apiVersion: hello.world/v1alpha1
kind: HelloWorld
metadata:
  name: hello
  namespace: default
spec:
  description:
   - a
   - c
   - d
   - e

then update

apiVersion: hello.world/v1alpha1
kind: HelloWorld
metadata:
  name: hello
  namespace: default
spec:
  description:
   - a
   - d
   - e
   - g
```