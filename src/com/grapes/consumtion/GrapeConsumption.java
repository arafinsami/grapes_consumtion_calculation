package com.grapes.consumtion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GrapeConsumption {

	int totalGrapes;

	int days;

	int increment;
}
