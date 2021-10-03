package live.project.open_banking_app.controller;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

import live.project.open_banking_app.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

@SpringBootTest
public class TransactionComponentTest {

  @MockBean private TransactionService transactionService;

  @Test
  public void testGetTransactions() {
    given()
        .standaloneSetup(new TransactionController(transactionService))
        .when()
        .get("/transactions")
        .then()
        .statusCode(HttpStatus.OK.value());
  }
}