package p515o0o0O0O0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogActionTypeHitDetail;
import com.yalla.yalla.model.MomentLogSourcePage;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;
import p501o0o00oO0.OooOOO;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o {
    public static void OooO00o(Context context, MomentDetailModel data, MomentAdapterTag momentAdapterTag, boolean z, int i, boolean z2, int i2) {
        if ((i2 & 16) != 0) {
            i = -1;
        }
        int i3 = i;
        boolean z3 = (i2 & 32) != 0 ? false : z2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        if (z || momentAdapterTag == MomentAdapterTag.MomentEditRecord) {
            return;
        }
        MomentLogSourcePage momentLogSourcePageOooO00o = z ? MomentLogSourcePage.moments_content : OooOOO.OooO00o(momentAdapterTag);
        if (momentLogSourcePageOooO00o != null && momentLogSourcePageOooO00o != MomentLogSourcePage.moments_content) {
            long userId = data.getUserId();
            StringBuilder sb = new StringBuilder();
            sb.append(userId);
            if (!OooOOOO.OooO0oo(sb.toString())) {
                MomentLogActionTypeHitDetail momentLogActionTypeHitDetail = new MomentLogActionTypeHitDetail(null, null, 3, null);
                long userId2 = data.getUserId();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(userId2);
                momentLogActionTypeHitDetail.setObject_userid(sb2.toString());
                momentLogActionTypeHitDetail.setDiscoveryid(o0OoOo0.OooOOO0("", Long.valueOf(data.getId())));
                WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                MomentLogActionType momentLogActionType = MomentLogActionType.hit_detail;
                String json = momentLogActionTypeHitDetail.toJson();
                String sessionId = data.getSessionId();
                webEventRepository.getClass();
                WebEventRepository.OooO0o(momentLogSourcePageOooO00o, momentLogActionType, json, sessionId);
            }
        }
        int i4 = MomentDetailActivity.f26057Oooo0;
        MomentDetailActivity.OooO00o.OooO00o(context, data, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 4) != 0 ? false : z3, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 8) != 0 ? 1 : i3, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 16) != 0 ? null : null, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 32) != 0 ? false : momentAdapterTag == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 64) != 0 ? null : momentAdapterTag, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 128) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? "" : null);
    }
}
