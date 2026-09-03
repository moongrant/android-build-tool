package p493o0o00OOO;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 {
    public static void OooO00o(@Nullable List list, @Nullable MomentSendCommentModel momentSendCommentModel, @NotNull OooOo listener) {
        MomentCommentDetailModel momentCommentDetailModel;
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (list == null || momentSendCommentModel == null) {
            return;
        }
        if (o0OoOo0.OooOO0(Long.valueOf(momentSendCommentModel.getLocalId())) <= 0) {
            momentSendCommentModel.setLocalId(System.currentTimeMillis());
        }
        if (TextUtils.isEmpty(momentSendCommentModel.getCid())) {
            MomentCommentDetailModel momentCommentDetailModel2 = new MomentCommentDetailModel();
            momentCommentDetailModel2.setLocalSendingCommentModel(momentSendCommentModel);
            listener.OooO00o(momentCommentDetailModel2);
            return;
        }
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                momentCommentDetailModel = null;
                i = -1;
                break;
            } else {
                momentCommentDetailModel = (MomentCommentDetailModel) list.get(i);
                if (Intrinsics.areEqual(momentSendCommentModel.getCid(), String.valueOf(momentCommentDetailModel.getId()))) {
                    momentCommentDetailModel.addLocalSendingCommentReplyModel(momentSendCommentModel);
                    break;
                }
                i++;
            }
        }
        if (momentCommentDetailModel != null) {
            listener.OooO0O0(momentCommentDetailModel, i);
        }
    }
}
