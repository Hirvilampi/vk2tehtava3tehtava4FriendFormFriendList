package viikko2.tehtava3.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import viikko2.tehtava3.domain.Friend;

@Controller
public class FriendController {

    private static List<Friend> friendList = new ArrayList<>();

    // static {
    // friendList.add(new Friend("Minna","Minnanen"));
    // friendList.add(new Friend("Tuija","Minnanen"));
    // friendList.add(new Friend("Yrjö","Allas"));
    // }

    @RequestMapping("*")
    public String showMainPage() {
        return "main";
    }

    @GetMapping("/addform")
    public String addFriendForm(Model model) {
        model.addAttribute("friend", new Friend());
        return "addform";
    }

    @GetMapping("/friendlist")
    public String showCustomers(Model model) {
        System.out.println("friends...");
        // insert friend list to model as a key-value pair
        model.addAttribute("friends", friendList);
        return "friends";
    }

    @GetMapping("/newfriend")
    public String showNewFriend(Model model) {
        System.err.println("friends...");
        model.addAttribute("friends", friendList);
        return "result";
    }

    @PostMapping("saveFriend")
    // public String saveCar(@ModelAttribute Car car, Model model) {
    public String saveCar(Friend friend) {
        System.out.println("Database is not implemented : " + friend);
        // TODO save to database
        // now we are saving to list variable instead of db
        friendList.add(friend);
        // carList.add(car);
        return "redirect:/newfriend";
        // return "redirect:/carlist";
    }

}
