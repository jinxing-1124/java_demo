# Getting Started

資料庫版本控管：[liquibase](https://blog.samzhu.dev/2021/06/10/Use-Liquibase-to-Safely-Evolve-Your-Database-Schema/)
## Model 分層設計原則
1. DAO：指的是「資料存取物件」（Data Access Object）。它是一種設計模式，目的在於將應用程式的商業邏輯和資料庫操作分離開來。DAO 提供了一個抽象層，讓應用程式的其他部分可以與資料庫進行交互，而不需要了解底層資料庫的具體實現細節。
2. Entity：與資料庫表結構一一對應，透過 DAO 層向上傳輸資料源物件。例如，我們有一個名為 TechEntity 的物件，它的屬性和資料庫中的 tech 表一一對應。
3. VO：顯示層物件，通常是 Web 向模板渲染引擎層傳輸的物件。例如，DemoVO 可能會包含一個商品的所有詳細資訊。
4. DTO：資料傳輸型物件，Service 或 Manager 向外傳輸的物件。例如，DemoDTO 可能會包含訂單的基本資訊以及訂單中商品的列表。

## 執行方式

```sh
# 啟動 postgresql 
docker-compose up -d
# -Pxtest -> skip test phase
# 本機開發環境 profile
./gradlew bootRun --args='--spring.profiles.active=dev'
```

## 啟動服務後，測試API

```
Get Data
[Get] http://localhost:8081/api/demo

Add Data
[Post] http://localhost:8081/api/demo
body:
{
    "name":"angular"
}
```

