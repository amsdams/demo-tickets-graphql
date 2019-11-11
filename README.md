# demo-tickets-graphql
Simple demonstration of using graphql with spring boot

Run apop and browse to http://localhost:8080/graphiql.
Enter following requests:


```
mutation{
 newApplication (name:"asd", owner:"owner", description:"description"){
  id
}
  
}
```

```
query{
  findAllApplications {
    id
    owner
  }
}
```

```
mutation{
 updateApplicationOwner(newOwner:"kaka", id:1){
  id
  owner
  
}
  
}
```

```
mutation{
 deleteApplication(id:1)
  
}
```

