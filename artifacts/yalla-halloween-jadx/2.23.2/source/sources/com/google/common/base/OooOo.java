package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f18598OooO00o;

    public OooOo(String str) {
        str.getClass();
        this.f18598OooO00o = str;
    }

    @CanIgnoreReturnValue
    public final void OooO00o(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(OooO0O0(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f18598OooO00o);
                    sb.append(OooO0O0(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public CharSequence OooO0O0(@CheckForNull Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public OooOo(OooOo oooOo) {
        this.f18598OooO00o = oooOo.f18598OooO00o;
    }
}
