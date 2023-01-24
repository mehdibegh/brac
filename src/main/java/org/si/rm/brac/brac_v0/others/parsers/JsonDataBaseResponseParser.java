package org.si.rm.brac.brac_v0.others.parsers;
import org.si.rm.brac.brac_v0.models.Fxmodels.FxModel;

import java.util.ArrayList;

public interface JsonDataBaseResponseParser {
    ArrayList<FxModel> get(String JsonData);
}
