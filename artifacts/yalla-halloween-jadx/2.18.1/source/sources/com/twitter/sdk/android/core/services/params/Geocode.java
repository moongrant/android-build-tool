package com.twitter.sdk.android.core.services.params;

/* JADX INFO: loaded from: classes2.dex */
public final class Geocode {

    public enum Distance {
        MILES("mi"),
        KILOMETERS("km");

        public final String identifier;

        Distance(String str) {
            this.identifier = str;
        }
    }
}
