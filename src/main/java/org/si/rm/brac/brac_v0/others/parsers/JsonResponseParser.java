package org.si.rm.brac.brac_v0.others.parsers;
import org.json.*;
import org.si.rm.brac.brac_v0.models.Fxmodels.FxModel;

import java.util.ArrayList;
import java.util.HashMap;

public interface JsonResponseParser {
    ArrayList<FxModel> get(String JsonData);
}
