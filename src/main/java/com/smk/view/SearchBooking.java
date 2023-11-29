package com.smk.view;

import com.smk.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.sql.Date;
import java.time.ZoneId;

@PageTitle("Search Booking")
@Route(value = "search-booking", layout = MainView.class)
public class SearchBooking extends VerticalLayout {

    public SearchBooking() {
        // Create a title for the page
        H2 title = new H2("Search Booking");
        add(title);

        // Create a form layout to hold the input fields
        FormLayout form = new FormLayout();
        add(form);

        // Create a combo box for the departure city
        ComboBox<String> departureCity = new ComboBox("Dari");
        departureCity.setItems("Jakarta", "Bandung", "Surabaya", "Semarang");
        departureCity.setRequired(true);
        form.add(departureCity);

        // Create a combo box for the destination city
        ComboBox<String> destinationCity = new ComboBox("Ke");
        destinationCity.setItems("Jakarta", "Bandung", "Surabaya", "Semarang");
        destinationCity.setRequired(true);
        form.add(destinationCity);

        // Create a date picker for the departure date
        DatePicker departureDate = new DatePicker("Tanggal Keberangkatan");
        departureDate.setMin(null);
        departureDate.setRequired(true);
        form.add(departureDate);

        // Create a date picker for the return date
        DatePicker returnDate = new DatePicker("Tanggal Kepulangan");
        returnDate.setMin(null);
        returnDate.setRequired(true);
        form.add(returnDate);

        // Create a button to submit the search
        Button searchButton = new Button("Search");
        searchButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        searchButton.addClickListener(clickEvent -> {
            // TODO: implement the logic to search for flights
        });
        form.add(searchButton);
    }
}