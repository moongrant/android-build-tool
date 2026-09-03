package p563o0oOo0;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TextView f45081Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(TextView textView) {
        super(1);
        this.f45081Oooo0o = textView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.f45081Oooo0o.setText(str);
        return null;
    }
}
