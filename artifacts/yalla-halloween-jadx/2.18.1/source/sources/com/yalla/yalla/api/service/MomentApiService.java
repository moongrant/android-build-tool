package com.yalla.yalla.api.service;

import com.app.base.fragment.ContributionFragment;
import com.app.base.model.MomentBarGetServerIpModel;
import com.app.base.model.NewFollowMomentModel;
import com.facebook.appevents.integrity.IntegrityManager;
import com.umeng.analytics.pro.ak;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.CheckUserBlackResultModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentEditBefore;
import com.yalla.yalla.model.MomentEditResult;
import com.yalla.yalla.model.MomentGift;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.model.MomentSendResultModel;
import com.yalla.yalla.model.PollConfig;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.model.PostSendGiftModel;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.model.ReportCommentDetailModel;
import com.yalla.yalla.model.RewardCommentResultModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0012JO\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ5\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J'\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00040\u00032\b\b\u0001\u0010\u001f\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010 J+\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010\u001f\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010#J+\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u001f\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010&JO\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010(\u001a\u00020\r2\b\b\u0001\u0010)\u001a\u00020\r2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\rH§@ø\u0001\u0000¢\u0006\u0002\u0010,J!\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0081\u0001\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u00100\u001a\u00020\r2\b\b\u0001\u0010)\u001a\u00020\r2\b\b\u0001\u00101\u001a\u00020\b2\b\b\u0001\u00102\u001a\u00020\r2\n\b\u0001\u00103\u001a\u0004\u0018\u00010\r2\n\b\u0001\u00104\u001a\u0004\u0018\u00010\r2\n\b\u0001\u00105\u001a\u0004\u0018\u00010\b2\b\b\u0001\u00106\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u00107J\u0099\u0001\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u00100\u001a\u00020\r2\b\b\u0001\u0010)\u001a\u00020\r2\b\b\u0001\u00101\u001a\u00020\b2\b\b\u0001\u00102\u001a\u00020\r2\n\b\u0001\u00103\u001a\u0004\u0018\u00010\r2\n\b\u0001\u00104\u001a\u0004\u0018\u00010\r2\n\b\u0001\u00105\u001a\u0004\u0018\u00010\b2\n\b\u0001\u00108\u001a\u0004\u0018\u00010\r2\n\b\u0001\u00109\u001a\u0004\u0018\u00010\r2\b\b\u0001\u00106\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010:J!\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00032\b\b\u0001\u0010(\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010 J!\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00032\b\b\u0001\u0010\u001f\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010 JE\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010(\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010@J\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010CJ!\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00032\b\b\u0001\u0010F\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010 JS\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00032\b\b\u0001\u0010\u001a\u001a\u00020\r2\b\b\u0001\u0010I\u001a\u00020\r2\b\b\u0001\u00108\u001a\u00020\r2\b\b\u0001\u00109\u001a\u00020\r2\b\b\u0003\u0010J\u001a\u00020\r2\b\b\u0003\u00106\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010KJE\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010M\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010NJO\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010M\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J+\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u001a\u001a\u00020\r2\b\b\u0001\u0010P\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010#J;\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010RJ1\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010TJ;\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010RJE\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010WJ5\u0010X\u001a\b\u0012\u0004\u0012\u00020E0\u00032\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010F\u001a\u00020\u00062\b\b\u0001\u0010Y\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010ZJ;\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010RJ\u001d\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010CJ!\u0010^\u001a\b\u0012\u0004\u0012\u00020H0\u00032\b\b\u0001\u0010_\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u008d\u0001\u0010`\u001a\b\u0012\u0004\u0012\u00020a0\u00032\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\r2\n\b\u0003\u00102\u001a\u0004\u0018\u00010\r2\n\b\u0003\u00103\u001a\u0004\u0018\u00010\r2\n\b\u0003\u00104\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0011\u001a\u00020\b2\n\b\u0003\u0010c\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010d\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010e\u001a\u0004\u0018\u00010\rH§@ø\u0001\u0000¢\u0006\u0002\u0010fJ\u0099\u0001\u0010`\u001a\b\u0012\u0004\u0012\u00020a0\u00032\n\b\u0003\u0010b\u001a\u0004\u0018\u00010\r2\n\b\u0003\u00102\u001a\u0004\u0018\u00010\r2\n\b\u0003\u00103\u001a\u0004\u0018\u00010\r2\n\b\u0003\u00104\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0011\u001a\u00020\b2\n\b\u0003\u0010c\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010d\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010g\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010e\u001a\u0004\u0018\u00010\rH§@ø\u0001\u0000¢\u0006\u0002\u0010hJ!\u0010i\u001a\b\u0012\u0004\u0012\u00020j0\u00032\b\b\u0001\u0010\u001a\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ!\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010l\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010 JI\u0010m\u001a\b\u0012\u0004\u0012\u00020n0\u00032\b\b\u0001\u0010(\u001a\u00020\u00062\b\b\u0001\u0010o\u001a\u00020\u00062\b\b\u0001\u0010I\u001a\u00020\r2\b\b\u0001\u00108\u001a\u00020\r2\b\b\u0001\u00109\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010pJ+\u0010q\u001a\b\u0012\u0004\u0012\u00020r0\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ;\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\r2\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010uJE\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0\u00040\u00032\b\b\u0001\u0010\u001a\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010vJ?\u0010w\u001a\b\u0012\u0004\u0012\u00020x0\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010y\u001a\u00020\r2\b\b\u0001\u0010z\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010{JE\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010_\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010vJ+\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\tJO\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010P\u001a\u00020\b2\b\b\u0003\u0010\u0017\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u007f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0080\u0001"}, d2 = {"Lcom/yalla/yalla/api/service/MomentApiService;", "", "advertiBlockIns", "Lcom/yalla/yalla/common/model/ApiResult;", "", "adid", "", "sourcepage", "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkUserBlack", "Lcom/yalla/yalla/model/CheckUserBlackResultModel;", "toUserId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "circleBlackIns", "circleId", "type", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "circleDiscovery", "Lcom/yalla/yalla/model/MomentDetailModel;", "dateSort", "pageIndex", "pageSize", "(JIJIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "circleDiscoveryDelete", "dyId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "circleDiscoveryTopIns", "commentParentCommentInfo", "Lcom/yalla/yalla/model/PostCommentDetailModel;", "commentId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commentPraise", "Lcom/yalla/yalla/model/PraiseCommentResultModel;", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commentSendProp", "Lcom/yalla/yalla/model/RewardCommentResultModel;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commentWrite", "momentId", "content", "parentUserId", "parentUserName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delMoment", "editMoment", "Lcom/yalla/yalla/model/MomentEditResult;", "editToken", "countryId", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "longitude", "latitude", "isNewPic", ak.N, "(JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pNumber", "size", "(JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editMomentBefore", "Lcom/yalla/yalla/model/MomentEditBefore;", "getCommentInfo", "Lcom/yalla/yalla/model/ReportCommentDetailModel;", "getEditHistory", "(JIJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVoteConfig", "Lcom/yalla/yalla/model/PollConfig;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVoteInfo", "Lcom/yalla/yalla/model/MomentPoll;", "voteId", "momentChangeImagesUrl", "Lcom/app/base/model/MomentBarGetServerIpModel;", "fileName", "sources", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "momentCommentList", "sortType", "(JIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "momentDetail", "sourceType", "momentFeaturedList", "(JIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "momentFollowList", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "momentGiftList", "Lcom/yalla/yalla/model/MomentGift;", "(IJJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "momentPoll", "voteOptionId", "(IJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "momentRecommendList", "momentRecommendUserList", "Lcom/yalla/yalla/model/RecommendNewPostModel;", "momentRoomGetServerIP", ContributionFragment.ARG_1, "momentSend", "Lcom/yalla/yalla/model/MomentSendResultModel;", "power", "notifyUserid", "sourcesId", "circleName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shareType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "momentSquareFriendIsNew", "Lcom/app/base/model/NewFollowMomentModel;", "momentsDurationAdd", "duration", "picUpdateSet", "", "editId", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postPraise", "Lcom/yalla/yalla/model/PraisePostResultModel;", "praiseList", "Lcom/yalla/yalla/model/PostUserModel;", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;JIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendGift", "Lcom/yalla/yalla/model/PostSendGiftModel;", "propId", "propNum", "(Ljava/lang/String;JLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "squareBarMember", "topInsForUserPost", "userMomentList", "(JJIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MomentApiService {

    public static final class OooO00o {
    }

    @GET("/Webservers/Moment/AdvertiBlockIns")
    @Nullable
    Object advertiBlockIns(@Query("adid") long j, @Query("sourcepage") int i, @NotNull Continuation<? super ApiResult<List<Object>>> continuation);

    @GET("/Webservers/Moment/CheckUserBlack")
    @Nullable
    Object checkUserBlack(@NotNull @Query("touserid") String str, @NotNull Continuation<? super ApiResult<CheckUserBlackResultModel>> continuation);

    @GET("/Webservers/Circle/CircleBlackIns")
    @Nullable
    Object circleBlackIns(@Query("circleid") long j, @Query("touserid") long j2, @Query("type") int i, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @GET("/Webservers/Discovery/CircleDiscovery")
    @Nullable
    Object circleDiscovery(@Query("circleId") long j, @Query("type") int i, @Query("datesort") long j2, @Query("pageindex") int i2, @Query("pagesize") int i3, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation);

    @GET("/Webservers/Circle/CircleDiscoveryDelete")
    @Nullable
    Object circleDiscoveryDelete(@Query("circleid") long j, @Query("dyid") long j2, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @GET("/Webservers/Circle/CircleDiscoveryTopIns")
    @Nullable
    Object circleDiscoveryTopIns(@Query("circleid") long j, @Query("dyid") long j2, @Query("type") int i, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @GET("/Webservers/Comment/CommentSltPcid")
    @Nullable
    Object commentParentCommentInfo(@Query("cid") long j, @NotNull Continuation<? super ApiResult<List<PostCommentDetailModel>>> continuation);

    @GET("/Webservers/Comment/Praise")
    @Nullable
    Object commentPraise(@NotNull @Query("commentId") String str, @Query("type") int i, @NotNull Continuation<? super ApiResult<PraiseCommentResultModel>> continuation);

    @GET("/Webservers/Comment/CommentSendProp")
    @Nullable
    Object commentSendProp(@NotNull @Query("commentid") String str, @NotNull @Query("touserid") String str2, @NotNull Continuation<? super ApiResult<RewardCommentResultModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Comment/Write")
    @Nullable
    Object commentWrite(@Field("dyid") @NotNull String str, @Field("content") @NotNull String str2, @Field("cid") @Nullable String str3, @Field("parentUserId") @Nullable String str4, @Field("parentUserName") @Nullable String str5, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @GET("/Webservers/Moment/Del")
    @Nullable
    Object delMoment(@Query("dyid") long j, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Discovery/EditMoment")
    @Nullable
    Object editMoment(@Field("dyId") long j, @Field("type") int i, @Field("editToken") @NotNull String str, @Field("content") @NotNull String str2, @Field("countryId") int i2, @Field(IntegrityManager.INTEGRITY_TYPE_ADDRESS) @NotNull String str3, @Field("longitude") @Nullable String str4, @Field("latitude") @Nullable String str5, @Field("isNewPic") @Nullable Integer num, @Field("pNumber") @Nullable String str6, @Field("size") @Nullable String str7, @Field(ak.N) @NotNull String str8, @NotNull Continuation<? super ApiResult<MomentEditResult>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Discovery/EditMoment")
    @Nullable
    Object editMoment(@Field("dyId") long j, @Field("type") int i, @Field("editToken") @NotNull String str, @Field("content") @NotNull String str2, @Field("countryId") int i2, @Field(IntegrityManager.INTEGRITY_TYPE_ADDRESS) @NotNull String str3, @Field("longitude") @Nullable String str4, @Field("latitude") @Nullable String str5, @Field("isNewPic") @Nullable Integer num, @Field(ak.N) @NotNull String str6, @NotNull Continuation<? super ApiResult<MomentEditResult>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Discovery/EditMomentBefore")
    @Nullable
    Object editMomentBefore(@Field("dyId") long j, @NotNull Continuation<? super ApiResult<MomentEditBefore>> continuation);

    @GET("/Webservers/Comment/GetInfo")
    @Nullable
    Object getCommentInfo(@Query("cid") long j, @NotNull Continuation<? super ApiResult<ReportCommentDetailModel>> continuation);

    @GET("/Webservers/Discovery/GetEditHistory")
    @Nullable
    Object getEditHistory(@Query("dyId") long j, @Query("pageindex") int i, @Query("datesort") long j2, @Query("pagesize") int i2, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation);

    @GET("/Webservers/Moment/GetVoteConfig")
    @Nullable
    Object getVoteConfig(@NotNull Continuation<? super ApiResult<PollConfig>> continuation);

    @GET("/Webservers/Moment/GetVoteInfo")
    @Nullable
    Object getVoteInfo(@Query("voteId") long j, @NotNull Continuation<? super ApiResult<MomentPoll>> continuation);

    @GET("/Webservers/Resource/PicSet")
    @Nullable
    Object momentChangeImagesUrl(@NotNull @Query("dyid") String str, @NotNull @Query("fileName") String str2, @NotNull @Query("pNumber") String str3, @NotNull @Query("size") String str4, @NotNull @Query("sources") String str5, @NotNull @Query(ak.N) String str6, @NotNull Continuation<? super ApiResult<MomentBarGetServerIpModel>> continuation);

    @GET("/Webservers/Comment/List")
    @Nullable
    Object momentCommentList(@Query("dyid") long j, @Query("sortType") int i, @Query("pageindex") int i2, @Query("pagesize") int i3, @NotNull Continuation<? super ApiResult<List<PostCommentDetailModel>>> continuation);

    @GET("/Webservers/Comment/List")
    @Nullable
    Object momentCommentList(@Query("dyid") long j, @Query("sortType") int i, @Query("datesort") long j2, @Query("pageindex") int i2, @Query("pagesize") int i3, @NotNull Continuation<? super ApiResult<List<PostCommentDetailModel>>> continuation);

    @GET("/Webservers/Discovery/SquareSingle")
    @Nullable
    Object momentDetail(@NotNull @Query("dyId") String str, @Query("sourceType") int i, @NotNull Continuation<? super ApiResult<MomentDetailModel>> continuation);

    @GET("/Webservers/Discovery/SquareHot")
    @Nullable
    Object momentFeaturedList(@Query("datesort") long j, @Query("pageindex") int i, @Query("pagesize") int i2, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation);

    @GET("Webservers/Discovery/SquareFriend")
    @Nullable
    Object momentFollowList(@Query("pageindex") int i, @Query("pagesize") int i2, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation);

    @GET("Webservers/Discovery/SquareFriend")
    @Nullable
    Object momentFollowList(@Query("datesort") long j, @Query("pageindex") int i, @Query("pagesize") int i2, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation);

    @GET("/Webservers/Moment/DySendPropDetail")
    @Nullable
    Object momentGiftList(@Query("type") int i, @Query("dyid") long j, @Query("datesort") long j2, @Query("pageindex") int i2, @NotNull Continuation<? super ApiResult<List<MomentGift>>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Moment/Vote")
    @Nullable
    Object momentPoll(@Field("type") int i, @Field("voteId") long j, @Field("voteOptionId") long j2, @NotNull Continuation<? super ApiResult<MomentPoll>> continuation);

    @GET("/Webservers/Discovery/RecommendSquare")
    @Nullable
    Object momentRecommendList(@Query("datesort") long j, @Query("pageindex") int i, @Query("pagesize") int i2, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation);

    @GET("/Webservers/Moment/DyRecommendUsers")
    @Nullable
    Object momentRecommendUserList(@NotNull Continuation<? super ApiResult<List<RecommendNewPostModel>>> continuation);

    @GET("/Webservers/Moment/BarGetServerIP")
    @Nullable
    Object momentRoomGetServerIP(@NotNull @Query("roomid") String str, @NotNull Continuation<? super ApiResult<MomentBarGetServerIpModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Moment/PublishV1")
    @Nullable
    Object momentSend(@Field("power") @Nullable String str, @Field(IntegrityManager.INTEGRITY_TYPE_ADDRESS) @Nullable String str2, @Field("longitude") @Nullable String str3, @Field("latitude") @Nullable String str4, @Field("type") int i, @Field("notifyUserid") @Nullable String str5, @Field("sourcesid") @Nullable String str6, @Field("shareType") @Nullable String str7, @Field("content") @Nullable String str8, @Field("circleId") @Nullable String str9, @Field("circleName") @Nullable String str10, @NotNull Continuation<? super ApiResult<MomentSendResultModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Moment/PublishV1")
    @Nullable
    Object momentSend(@Field("power") @Nullable String str, @Field(IntegrityManager.INTEGRITY_TYPE_ADDRESS) @Nullable String str2, @Field("longitude") @Nullable String str3, @Field("latitude") @Nullable String str4, @Field("type") int i, @Field("notifyUserid") @Nullable String str5, @Field("sourcesid") @Nullable String str6, @Field("content") @Nullable String str7, @Field("circleId") @Nullable String str8, @Field("circleName") @Nullable String str9, @NotNull Continuation<? super ApiResult<MomentSendResultModel>> continuation);

    @GET("/Webservers/Moment/SquareFriendIsNew")
    @Nullable
    Object momentSquareFriendIsNew(@NotNull @Query("dyid") String str, @NotNull Continuation<? super ApiResult<NewFollowMomentModel>> continuation);

    @GET("/Webservers/Moment/MomentsDurationAdd")
    @Nullable
    Object momentsDurationAdd(@Query("duration") long j, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Resource/PicUpdateSet")
    @Nullable
    Object picUpdateSet(@Field("dyId") long j, @Field("editId") long j2, @Field("fileName") @NotNull String str, @Field("pNumber") @NotNull String str2, @Field("size") @NotNull String str3, @NotNull Continuation<? super ApiResult<Boolean>> continuation);

    @GET("/Webservers/Moment/Praise")
    @Nullable
    Object postPraise(@Query("dyid") long j, @Query("type") int i, @NotNull Continuation<? super ApiResult<PraisePostResultModel>> continuation);

    @GET("/Webservers/Moment/PraiseList")
    @Nullable
    Object praiseList(@NotNull @Query("dyid") String str, @Query("pageindex") int i, @Query("pagesize") int i2, @NotNull Continuation<? super ApiResult<List<PostUserModel>>> continuation);

    @GET("/Webservers/Moment/PraiseList")
    @Nullable
    Object praiseList(@NotNull @Query("dyid") String str, @Query("datesort") long j, @Query("pageindex") int i, @Query("pagesize") int i2, @NotNull Continuation<? super ApiResult<List<PostUserModel>>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Moment/SendProp")
    @Nullable
    Object sendGift(@Field("touserid") @NotNull String str, @Field("dyid") long j, @Field("propid") @NotNull String str2, @Field("propnum") int i, @NotNull Continuation<? super ApiResult<PostSendGiftModel>> continuation);

    @GET("/Webservers/Discovery/SquareBarMember")
    @Nullable
    Object squareBarMember(@NotNull @Query(ContributionFragment.ARG_1) String str, @Query("datesort") long j, @Query("pageindex") int i, @Query("pagesize") int i2, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation);

    @GET("/Webservers/Moment/DiscoveryTopIns")
    @Nullable
    Object topInsForUserPost(@Query("dyid") long j, @Query("type") int i, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @GET("/Webservers/Discovery/SquarePersonal")
    @Nullable
    Object userMomentList(@Query("toUserId") long j, @Query("datesort") long j2, @Query("pageindex") int i, @Query("sourceType") int i2, @Query("pagesize") int i3, @NotNull Continuation<? super ApiResult<List<MomentDetailModel>>> continuation);
}
