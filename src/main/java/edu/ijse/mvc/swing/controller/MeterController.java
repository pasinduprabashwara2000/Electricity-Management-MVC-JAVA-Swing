package edu.ijse.mvc.swing.controller;

import com.mvc.fx.dto.MeterDto;
import com.mvc.fx.model.MeterModel;

import java.util.ArrayList;

public class MeterController {

    private MeterModel meterModel = new MeterModel();

    public String addMeter(MeterDto meterDto) throws Exception{
        return meterModel.addMeter(meterDto);
    }

    public String updateMeter(MeterDto meterDto) throws Exception{
        return meterModel.updateMeter(meterDto);
    }

    public String deleteMeter(String id) throws Exception{
        return meterModel.deleteMeter(id);
    }

    public MeterDto selectmeter(String id) throws Exception{
        return meterModel.selectMeter(id);
    }

    public ArrayList <MeterDto> getAllMeter() throws Exception{
        return meterModel.getAllMeter();
    }
}
