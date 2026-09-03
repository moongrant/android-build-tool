package p601o0oo00Oo;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.SendMomentEmojiAtPollView;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0o0000 extends Lambda implements Function3<Boolean, Integer, View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SendMomentEmojiAtPollView f48228Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0000(SendMomentEmojiAtPollView sendMomentEmojiAtPollView) {
        super(3);
        this.f48228Oooo0o = sendMomentEmojiAtPollView;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Boolean bool, Integer num, View view) {
        boolean zBooleanValue = bool.booleanValue();
        num.intValue();
        SendMomentEmojiAtPollView sendMomentEmojiAtPollView = this.f48228Oooo0o;
        if (zBooleanValue) {
            sendMomentEmojiAtPollView.getF25159Oooo0o().f50691OooO0OO.setImageResource(R.drawable.ic_moment_add_emoji);
        } else {
            sendMomentEmojiAtPollView.getF25159Oooo0o().f50691OooO0OO.setImageResource(R.drawable.ic_moment_add_keyboard);
        }
        int i = SendMomentEmojiAtPollView.f25157OoooO0O;
        Objects.requireNonNull(sendMomentEmojiAtPollView);
        return Unit.INSTANCE;
    }
}
