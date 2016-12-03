package org.dandj.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Accessors(fluent = true)
@Data
public class Region {
    private List<Cell> cells = new ArrayList<>();
    private int id;
}
