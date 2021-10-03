package live.project.open_banking_app.controller;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

import live.project.open_banking_app.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

public class TransactionComponentTest {

  @Test
  public void testApplicationEndToEnd() {
    given()
        .standaloneSetup(new TransactionController(new TransactionService()))
        .when()
        .get("/transactions")
        .then()
        .statusCode(HttpStatus.OK.value());
  }
}
