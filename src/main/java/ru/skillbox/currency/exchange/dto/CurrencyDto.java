package ru.skillbox.currency.exchange.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyDto {

    public interface AllCurrency {
    }

    private Long id;

    @JsonView(CurrencyDto.AllCurrency.class)
    private String name;

    private Long nominal;

    @JsonView(CurrencyDto.AllCurrency.class)
    private Double value;

    private Long isoNumCode;

    private String charCode;
}