package o00OO0O0;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.activity.room.OpenRedRnvelopesActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p176o00OoooO.oO000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends o00OoOO0.o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f31412OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ oO000OOo f31413OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(Oooo0 oooo0, oO000OOo oo000ooo, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f31412OooO00o = oooo0;
        this.f31413OooO0O0 = oo000ooo;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intent intent = new Intent(this.f31412OooO00o.f31409OooO00o, (Class<?>) OpenRedRnvelopesActivity.class);
        intent.putExtra("response", response);
        this.f31412OooO00o.f31409OooO00o.startActivity(intent);
        this.f31413OooO0O0.dismiss();
    }
}
