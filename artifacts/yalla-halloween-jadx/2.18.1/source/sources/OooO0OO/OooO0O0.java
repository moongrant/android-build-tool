package OooO0OO;

import OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o0OoOo0;
import OooO00o.OooOo;
import android.content.pm.PackageInfo;
import androidx.fragment.app.FragmentActivity;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.conversation.bean.ConversationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003OooO0Oo.OooOo00;
import p003OooO0Oo.Oooo000;
import p003OooO0Oo.o00O0O;
import p003OooO0Oo.o00Oo0;
import p003OooO0Oo.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends OooOo00 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(@NotNull p004OooO0o0.OooO0o fragment1) {
        super(fragment1);
        Intrinsics.checkNotNullParameter(fragment1, "fragment1");
    }

    @Override // p003OooO0Oo.OooOo00
    @Nullable
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public final OooO0o OooO0oO() {
        o00O0O o00o0o2 = this.f108OooO0Oo;
        if (!(o00o0o2 instanceof OooO0o)) {
            return null;
        }
        Objects.requireNonNull(o00o0o2, "null cannot be cast to non-null type com.yallatech.support.platform.conversation.Request");
        return (OooO0o) o00o0o2;
    }

    @Override // p003OooO0Oo.OooOo00
    @NotNull
    public final BaseResp OooO00o(int i, @Nullable String str) {
        Objects.requireNonNull(ConversationResponse.INSTANCE);
        ConversationResponse conversationResponse = new ConversationResponse();
        conversationResponse.setCode(i);
        if (str == null) {
            str = "";
        }
        conversationResponse.setMsg(str);
        return conversationResponse;
    }

    @Override // p003OooO0Oo.OooOo00
    @NotNull
    public final ArrayList<Oooo000> OooO0o() {
        Object next;
        ArrayList<Oooo000> arrayList = new ArrayList<>();
        FragmentActivity context = OooO0o0();
        OooOo appInfo = OooOo.f86OooO0O0;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        List<PackageInfo> installedPackages = context.getApplicationContext().getPackageManager().getInstalledPackages(0);
        Intrinsics.checkNotNullExpressionValue(installedPackages, "context.applicationConte…r.getInstalledPackages(0)");
        Iterator<T> it = installedPackages.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((PackageInfo) next).packageName, "com.yallatech.yallachat"));
        if (next != null) {
            arrayList.add(new o0OoOo0(this));
            arrayList.add(new o00Oo0(this));
            arrayList.add(new OooO(this));
        } else {
            Intrinsics.checkNotNullParameter("", "<set-?>");
            appInfo.f8OooO00o = "";
            o00O0O o00o0o2 = this.f108OooO0Oo;
            if (o00o0o2 != null) {
                o00o0o2.f116OooO00o = appInfo;
            }
            arrayList.add(new o00Oo0(this));
            arrayList.add(new oo000o(this));
        }
        return arrayList;
    }
}
