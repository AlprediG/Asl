package com.questglobal.smarthome.controller;


import com.questglobal.smarthome.models.Room;
import com.questglobal.smarthome.models.dto.RoomDto;
import com.questglobal.smarthome.services.RoomService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/rooms")
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(produces = {"application/json"})
    public Room getRoom(String id) {
        return roomService.findRoomById(id);
    }

    @PostMapping(produces = {"application/json"})
    public String registerNewRoom(@RequestBody RoomDto dto) {
        return roomService.insertNew(dto);
    }

    @DeleteMapping(path = "{id}")
    public Boolean deleteRoom(@PathVariable("id") String id) {
        return roomService.delete(id);
    }

    @PutMapping(path = "{id}")
    public Boolean updateRoom(@PathVariable("id") String id, @RequestBody RoomDto request) {
        return roomService.update(id, request);
    }
}
