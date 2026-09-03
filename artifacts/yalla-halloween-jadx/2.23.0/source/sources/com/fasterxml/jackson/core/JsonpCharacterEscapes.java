package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;
import java.util.Arrays;
import p178o00o000.oo000o;

/* JADX INFO: loaded from: classes3.dex */
public class JsonpCharacterEscapes extends CharacterEscapes {
    static {
        int[] iArr = oo000o.f38588OooO0Oo;
        Arrays.copyOf(iArr, iArr.length);
        new SerializedString("\\u2028");
        new SerializedString("\\u2029");
        new JsonpCharacterEscapes();
    }
}
