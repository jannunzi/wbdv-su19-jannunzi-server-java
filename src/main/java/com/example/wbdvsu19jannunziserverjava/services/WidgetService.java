package com.example.wbdvsu19jannunziserverjava.services;

import com.example.wbdvsu19jannunziserverjava.models.Widget;
import com.example.wbdvsu19jannunziserverjava.repositories.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WidgetService {

    @Autowired
    WidgetRepository repository;

    public List<Widget> findAllWidgets() {
        return repository.findAllWidgets();
    }

    public Widget findWidgetById(Integer id) {
        return repository.findWidgetById(id);
    }

    public List<Widget> deleteWidget(Integer id) {
        repository.deleteById(id);
        return repository.findAllWidgets();
    }
}
