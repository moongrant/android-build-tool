package p198o00o0OoO;

import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo00o implements o00OO00O.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39114OooO0Oo;

    public /* synthetic */ oo00o(Object obj) {
        this.f39114OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MomentPowerSelectActivity this$0 = (MomentPowerSelectActivity) this.f39114OooO0Oo;
        int i2 = MomentPowerSelectActivity.f26142OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        intent.putExtra("Data", (Serializable) this$0.f26143OooOOoo.get(i));
        this$0.setResult(-1, intent);
        this$0.finish();
    }

    @Override // o00o0OoO.o00OO00O.OooO00o
    public final Object apply(Object obj) {
        o00OO00O o00oo00o = (o00OO00O) this.f39114OooO0Oo;
        Cursor cursor = (Cursor) obj;
        o00oo00o.getClass();
        while (cursor.moveToNext()) {
            o00oo00o.OooOOo0(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }
}
