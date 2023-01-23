package org.si.rm.brac.brac_v0.others.factories;


import org.si.rm.brac.brac_v0.others.bulders.Builder;

public interface ServiceFactory {
    public Builder get(String product);
}
