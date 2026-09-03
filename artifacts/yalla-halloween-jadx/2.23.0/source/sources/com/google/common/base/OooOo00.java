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
public class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19082OooO00o;

    public OooOo00(String str) {
        str.getClass();
        this.f19082OooO00o = str;
    }

    @CanIgnoreReturnValue
    public final void OooO00o(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(OooO0O0(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f19082OooO00o);
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

    public OooOo00(OooOo00 oooOo00) {
        this.f19082OooO00o = oooOo00.f19082OooO00o;
    }
}
