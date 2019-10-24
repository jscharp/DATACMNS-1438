# [DATACMNS-1438](https://jira.spring.io/browse/DATACMNS-1438)

Our application still runs into this issue with boot 2.2.0.RELEASE. The use-case is quite specific.
This example narrows down to the core of the issue.

### Explanation
As we use a NoSQL document store (MongoDB), it persists some redundant data here and there. 
In our example, we have the following use-case

- We persist a `RootEntity`
- The `RootEntity` contains a list of `NestedEntity` objects.
- A `NestedEntity` object contains an `AnotherRootEntity`

The `AnotherRootEntity` is stored and kept up-to-date in its own collection. Once a `RootEntity` is persisted
we query the `AnotherRootEntity` and put that on the `NestedEntity`. We do not use a `@DbRef` here as we 
want to persist a snapshot of the `AnotherRootEntity` at the time of persisting the `RootEntity`. 
So once the `AnotherRootEntity` gets updated in its own collection, we do not want it to be modified in the `NestedEntity`. 

### Requirements
This example is built around MongoDB, but it doesn't actually require a running instance in order to see the error.

### Execution
```bash
mvn test
```