package com.questglobal.smarthome;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.bson.types.ObjectId;

import java.io.IOException;

public class Serializer  extends JsonSerializer<ObjectId>{
    @Override
    public void serialize(ObjectId id, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        jsonGenerator.writeObject(id == null ? null : id.toString());
    }
}
