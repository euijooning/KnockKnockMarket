package com.example.townmarket.commons.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class StatusResponseDto {

  private final int StatusCode;
  private final String message;

}
