package p650o0ooo;

import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOOo0O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f59014OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOOo0O(ViewHolder viewHolder) {
        super(1);
        this.f59014OooO0Oo = viewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.f59014OooO0Oo.setText(o0OO00O.tvUserName, str);
        return null;
    }
}
