package com.global.api.terminals.ingenico.responses;

import com.global.api.terminals.abstractions.IDeviceResponse;
import com.global.api.terminals.ingenico.variables.ParseFormat;
import com.global.api.terminals.ingenico.variables.TerminalResetStatus;

import java.nio.charset.StandardCharsets;

public class TerminalResetResponse extends IngenicoTerminalResponse implements IDeviceResponse {
    private byte[] _buffer;

    public TerminalResetResponse(byte[] buffer) {
        super(buffer, ParseFormat.Transaction);
        _buffer = buffer;
        parseResponse(buffer);
    }

    @Override
    public void parseResponse(byte[] response) {
        super.parseResponse(response);
        String rawData = new String(response, StandardCharsets.UTF_8);
        setStatus(TerminalResetStatus.getEnumName(
                Integer.parseInt(rawData.substring(2, 3))).toString());
    }

    @Override
    public String toString() {
        return new String(_buffer, StandardCharsets.UTF_8);
    }
}
