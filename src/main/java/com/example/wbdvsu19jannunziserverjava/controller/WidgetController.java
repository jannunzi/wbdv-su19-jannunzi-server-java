package com.example.wbdvsu19jannunziserverjava.controller;

import com.example.wbdvsu19jannunziserverjava.models.Widget;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("*")
public class WidgetController {
    private static List<Widget> widgets = new ArrayList<Widget>();

    static {
        widgets.add(new Widget(123L, "Widget 1", "HEADING"));
        widgets.add(new Widget(234L, "Widget 2", "IMAGE"));
        widgets.add(new Widget(345L, "Widget 3", "LIST"));
        widgets.add(new Widget(456L, "Widget 4", "LINK"));
    }

    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets() {
        return widgets;
    }

    @DeleteMapping("/api/widgets/{wid}")
    public List<Widget> deleteWidget(
            @PathVariable("wid") Long widgetId) {
        widgets = widgets
                .stream()
                .filter(widget -> !widget.getId().equals(widgetId))
                .collect(Collectors.toList());
        return widgets;
    }
}
