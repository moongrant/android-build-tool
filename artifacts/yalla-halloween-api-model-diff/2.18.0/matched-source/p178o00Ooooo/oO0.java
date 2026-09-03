package p178o00Ooooo;

import android.view.View;
import android.widget.RadioButton;
import com.facebook.FacebookButtonBase;
import com.yalla.yalla.common.ui.view.SetLuckyNumberLayout;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import p518o0o0O000.o00000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32914Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32915OoooO00;

    public /* synthetic */ oO0(Object obj, int i) {
        this.f32914Oooo = i;
        this.f32915OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32914Oooo) {
            case 0:
                boolean[] zArr = (boolean[]) this.f32915OoooO00;
                int i = oO0O00o0.f32922OooooOO;
                zArr[0] = !zArr[0];
                ((RadioButton) view).setChecked(zArr[0]);
                break;
            case 1:
                FacebookButtonBase.m90setupOnClickListener$lambda0((FacebookButtonBase) this.f32915OoooO00, view);
                break;
            case 2:
                SetLuckyNumberLayout this$0 = (SetLuckyNumberLayout) this.f32915OoooO00;
                int i2 = SetLuckyNumberLayout.f21033OoooOO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0Oo(0);
                this$0.OooO0O0(0);
                break;
            case 3:
                MainSearchActivity this$1 = (MainSearchActivity) this.f32915OoooO00;
                MainSearchActivity.OooO00o oooO00o = MainSearchActivity.f21986Ooooooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                o00000O.OooO00o(this$1.OooOoo().f49671OooO0O0, this$1);
                this$1.finish();
                break;
            default:
                TopicDetailActivity this$2 = (TopicDetailActivity) this.f32915OoooO00;
                TopicDetailActivity.OooO00o oooO00o2 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOoo();
                break;
        }
    }
}
