package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;
import java.util.Arrays;
import p221o00oOOO0.o0000;

/* JADX INFO: loaded from: classes3.dex */
public class JsonpCharacterEscapes extends CharacterEscapes {
    static {
        int[] iArr = o0000.f39661OooO0Oo;
        Arrays.copyOf(iArr, iArr.length);
        new SerializedString("\\u2028");
        new SerializedString("\\u2029");
        new JsonpCharacterEscapes();
    }
}
