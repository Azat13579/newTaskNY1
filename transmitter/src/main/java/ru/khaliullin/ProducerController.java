package ru.khaliullin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ProducerController {

    @Autowired
    KafkaSender kafkaSender;

    @GetMapping("/produc")
    public String producer() {
        return "produc";
    }

    @PostMapping("/produc")
    public @ResponseBody ResultModel producer(@RequestParam String name) {
        System.out.println(name);
        ResultModel rm = new ResultModel();
        rm.setName(name);

        kafkaSender.send(name);

        return rm;
    }
}
