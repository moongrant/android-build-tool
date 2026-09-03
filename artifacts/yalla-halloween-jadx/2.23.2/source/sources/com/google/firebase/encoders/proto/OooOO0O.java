package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import p297o0O0OooO.o0000O00;
import p297o0O0OooO.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f19697OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f19698OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0000O00 f19699OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f19700OooO0Oo;

    public OooOO0O(OooO0o oooO0o) {
        this.f19700OooO0Oo = oooO0o;
    }

    @Override // p297o0O0OooO.o000OO
    @NonNull
    public final o000OO OooO0o(boolean z) throws IOException {
        if (this.f19697OooO00o) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f19697OooO00o = true;
        this.f19700OooO0Oo.OooO0o(this.f19699OooO0OO, z ? 1 : 0, this.f19698OooO0O0);
        return this;
    }

    @Override // p297o0O0OooO.o000OO
    @NonNull
    public final o000OO OooO0o0(@Nullable String str) throws IOException {
        if (this.f19697OooO00o) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f19697OooO00o = true;
        this.f19700OooO0Oo.OooO0o0(this.f19699OooO0OO, str, this.f19698OooO0O0);
        return this;
    }
}
