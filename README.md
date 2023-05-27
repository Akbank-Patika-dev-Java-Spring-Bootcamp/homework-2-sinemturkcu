<details>
  <summary>APIs</summary>
    
  ## 1. PRODUCT

1. List all products
```text
GET : http://localhost:8083/api/v1/products
```

```json
[
    {
        "id": 1,
        "productName": "İphone 14 Pro +",
        "productPrice": 45000.0,
        "productCategory": "ELECTRONICS",
        "productStock": 10,
        "productDescription": "İphone 14 Pro + ,256 GB, Deep Purple",
        "productImageUrl": ""
    },
    {
        "id": 3,
        "productName": "Matte Lipstick",
        "productPrice": 100.0,
        "productCategory": "BEAUTY",
        "productStock": 50,
        "productDescription": null,
        "productImageUrl": null
    },
    {
        "id": 4,
        "productName": "Crime And Punishment",
        "productPrice": 50.0,
        "productCategory": "BOOKS",
        "productStock": 5,
        "productDescription": null,
        "productImageUrl": null
    },
    {
        "id": 5,
        "productName": "Lipstick",
        "productPrice": 60.0,
        "productCategory": "BEAUTY",
        "productStock": 20,
        "productDescription": null,
        "productImageUrl": null
    },
    {
        "id": 6,
        "productName": "APPLE MNWA3TU/A MacBook Pro",
        "productPrice": 92999.0,
        "productCategory": "ELECTRONICS",
        "productStock": 5,
        "productDescription": "M2 MAX/12CPU/38GPU/32GB RAM/1TBSSD/Uzay Grisi",
        "productImageUrl": ""
    }
]
```
2. Save product
```text
POST : http://localhost:8083/api/v1/products
```
```json
{
"productName":"APPLE MNWA3TU/A MacBook Pro",
"productPrice":92999,
"productCategory":"ELECTRONICS",
"productStock":5,
"productDescription":"M2 MAX/12CPU/38GPU/32GB RAM/1TBSSD/Uzay Grisi",
"productImageUrl":""
}
```
3. Get product by product id
```text
GET : http://localhost:8083/api/v1/products/{id}
```

```json
{
    "id": 6,
    "productName": "APPLE MNWA3TU/A MacBook Pro",
    "productPrice": 92999.0,
    "productCategory": "ELECTRONICS",
    "productStock": 5,
    "productDescription": "M2 MAX/12CPU/38GPU/32GB RAM/1TBSSD/Uzay Grisi",
    "productImageUrl": ""
}
```
4. Delete product
```text
DELETE : http://localhost:8083/api/v1/products/{id}
```
## 2. Client
1. List all clients
```text
GET : http://localhost:8083/api/v1/clients
```

```json
[
  {
    "fullName": "Sinem Türkçü",
    "email": "sinemturkcu@gmail.com",
    "phoneNumber": "5559995858",
    "enumClientType": "USER"
  },
  {
    "fullName": "İrem Akpınar",
    "email": "irem@gmail.com",
    "phoneNumber": "1111525685",
    "enumClientType": "USER"
  },
  {
    "fullName": "DrinaCompany",
    "email": "drina@gmail.com",
    "phoneNumber": "5557774414",
    "enumClientType": "COMPANY"
  }
]
```
2. Get client by client id
```text
GET : http://localhost:8083/api/v1/clients/{id}
```

```json
{
    "fullName": "Sinem Türkçü",
    "email": "sinemturkcu@gmail.com",
    "phoneNumber": "5559995858",
    "enumClientType": "USER"
}
```
3. Save client
```text
POST : http://localhost:8083/api/v1/clients
```

```json
request:
{
"fullName":"Işın Su",
"email":"isinsu@gmail.com",
"phoneNumber":"1111111111",
"enumClientType":"USER"

}
```
```json
response:
{
"id": 1,
"productName": "APPLE MNWA3TU/A MacBook Pro",
"productPrice": 92999.0,
"productCategory": "ELECTRONICS",
"productStock": 5,
"productDescription": "M2 MAX/12CPU/38GPU/32GB RAM/1TBSSD/Uzay Grisi",
"productImageUrl": ""
}
```
```json
response:
{
"data": {
"fullName": "Işın Su",
"email": "isinsu@gmail.com",
"phoneNumber": "1111111111",
"enumClientType": "USER"
},
"responseDate": "2023-05-27T16:57:03.1049662",
"messages": null,
"success": true
}
```
4. Get client by client name
```text
GET : http://localhost:8083/api/v1/clients/client?clientName=Işın Su
```

```json
{
    "fullName": "Işın Su",
    "email": "isinsu@gmail.com",
    "phoneNumber": "1111111111",
    "enumClientType": "USER"
}
```

5. Delete client by client id
```text
DELETE :  http://localhost:8083/api/v1/clients/{id}
```
  
## 2. Comment
1. List all comments
```text
GET : http://localhost:8083/api/v1/comments
```

```json
[
  {
    "id": 1,
    "comment": "This phone is so good :)",
    "productId": 1,
    "clientId": 1
  },
  {
    "id": 2,
    "comment": "I think so expensive",
    "productId": 1,
    "clientId": 2
  }
]
```
2. Get comment by comment id
```text
GET : http://localhost:8083/api/v1/comments/1
```

```json
{
  "id": 1,
  "comment": "This phone is so good :)",
  "productId": 1,
  "clientId": 1
}
```

3. Save comment
```text
POST : http://localhost:8083/api/v1/comments
```

```json
Request: 
{
    "comment":"This phone is so good :)",
    "productId":1,
    "clientId":1
}
```
```json
Response:
{
  "id": 1,
  "comment": "This phone is so good :)",
  "productId": 1,
  "clientId": 1
}
```
4. Get comments by client id
```text
   http://localhost:8083/api/v1/comments/client?clientId=1
```

```json
[
    {
        "id": 1,
        "comment": "This phone is so good :)",
        "productId": 1,
        "clientId": 1
    }
]
```
5. Get comments by product id
```text
GET http://localhost:8083/api/v1/comments/product?productId=1
```

```json
[
    {
        "id": 1,
        "comment": "This phone is so good :)",
        "productId": 1,
        "clientId": 1
    },
    {
        "id": 2,
        "comment": "I think so expensive",
        "productId": 1,
        "clientId": 2
    }
]
```
6. Delete comment
```text
DELETE : http://localhost:8083/api/v1/comments/{id} 
```
</details>

<details>
<summary>Technologies</summary>
 <br>
  
 - Spring Boot (3.1.0)
 -  MySQL
 -  Hibernate
 -  MapStruct
 - Lombok
  
</details>

