package p086o000OooO;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O extends Lambda implements Function0<Pattern> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f28512Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(o0OOO0o o0ooo0o2) {
        super(0);
        this.f28512Oooo0o = o0ooo0o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Pattern invoke() {
        String str = this.f28512Oooo0o.f28519OooO0o;
        if (str != null) {
            return Pattern.compile(str, 2);
        }
        return null;
    }
}
