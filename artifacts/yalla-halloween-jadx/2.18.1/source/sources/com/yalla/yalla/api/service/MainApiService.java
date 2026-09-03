package com.yalla.yalla.api.service;

import com.app.base.fragment.ContributionFragment;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.model.ReportModel;
import com.app.base.model.RoomIndexModel;
import com.app.base.model.RoomMemberConveneListModel;
import com.app.base.model.RoomMemberListModel;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.model.AccountPrivacy;
import com.yalla.yalla.model.ArrearsModel;
import com.yalla.yalla.model.BadgeBannerModel;
import com.yalla.yalla.model.BadgeModel;
import com.yalla.yalla.model.BadgeNews;
import com.yalla.yalla.model.BadgeRankModel;
import com.yalla.yalla.model.CountryListModel;
import com.yalla.yalla.model.CustomPrices;
import com.yalla.yalla.model.CustomizeThemeModel;
import com.yalla.yalla.model.FriendInRoomModel;
import com.yalla.yalla.model.GeetCodeModel;
import com.yalla.yalla.model.GuessData;
import com.yalla.yalla.model.LockBuyModel;
import com.yalla.yalla.model.LockShopModel;
import com.yalla.yalla.model.LockTimeModel;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.MyThemeListModel;
import com.yalla.yalla.model.PacketHistoryModel;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.PremiumTimeModel;
import com.yalla.yalla.model.RenewCustomizeTheme;
import com.yalla.yalla.model.RoomKickUser;
import com.yalla.yalla.model.RoomThemeAccept;
import com.yalla.yalla.model.RoomThemeGiveInfo;
import com.yalla.yalla.model.RoomThemeGiveState;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.model.SmsCodeModel;
import com.yalla.yalla.model.StoreRoomChatBubbleBuyModel;
import com.yalla.yalla.model.StoreRoomChatBubbleModel;
import com.yalla.yalla.model.ThemeBoughtModel;
import com.yalla.yalla.model.ThemeListModel;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.model.TreasureBoxCarouselInfo;
import com.yalla.yalla.model.TreasureBoxModel;
import com.yalla.yalla.model.VipBuyResultModel;
import com.yalla.yalla.model.VipPrivilegeModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p487o0o000oO.o0Oo0oo;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ò\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ'\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0014\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0017\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010 \u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010!J5\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010$\u001a\u00020\f2\b\b\u0003\u0010%\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010&J\u001d\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u000f0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J+\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010*\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010!J5\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010-\u001a\u00020\u001c2\b\b\u0001\u0010.\u001a\u00020\u001c2\b\b\u0001\u0010/\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u00100J-\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00032\b\b\u0001\u00103\u001a\u00020\u001c2\n\b\u0001\u00104\u001a\u0004\u0018\u00010\fH§@ø\u0001\u0000¢\u0006\u0002\u00105J+\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00032\b\b\u0001\u0010$\u001a\u00020\f2\b\b\u0003\u0010%\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J'\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u000f0\u00032\b\b\u0001\u0010:\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J!\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00032\b\b\u0001\u0010=\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001d\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u001d\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u000f0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J7\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0C0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010$\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010FJ+\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010H\u001a\u00020\f2\b\b\u0001\u0010I\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010JJ;\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010M\u001a\u00020\t2\b\b\u0001\u0010$\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ3\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0D0\u00032\b\b\u0001\u0010H\u001a\u00020\f2\n\b\u0001\u0010P\u001a\u0004\u0018\u00010\fH§@ø\u0001\u0000¢\u0006\u0002\u0010QJ1\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u000f0\u00032\b\b\u0001\u0010$\u001a\u00020\f2\b\b\u0001\u0010T\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J1\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0\u000f0\u00032\b\b\u0001\u0010$\u001a\u00020\f2\b\b\u0001\u0010V\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J+\u0010W\u001a\b\u0012\u0004\u0012\u00020X0\u00032\b\b\u0001\u0010Y\u001a\u00020\t2\b\b\u0001\u0010Z\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J!\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\u00032\b\b\u0001\u0010Y\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J+\u0010\\\u001a\b\u0012\u0004\u0012\u00020^0\u00032\b\b\u0001\u0010:\u001a\u00020\t2\b\b\u0001\u0010_\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010`J+\u0010a\u001a\b\u0012\u0004\u0012\u00020E0\u00032\b\b\u0001\u0010b\u001a\u00020\t2\b\b\u0001\u0010c\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010`J+\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u00032\b\b\u0001\u0010H\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J?\u0010f\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010.\u001a\u00020\u001c2\b\b\u0001\u0010g\u001a\u00020\u001c2\b\b\u0001\u0010-\u001a\u00020\u001c2\b\b\u0001\u0010/\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010hJ!\u0010i\u001a\b\u0012\u0004\u0012\u00020j0\u00032\b\b\u0001\u0010k\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J+\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\u00032\b\b\u0001\u0010H\u001a\u00020\u001c2\b\b\u0001\u0010n\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ'\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0\u000f0\u00032\b\b\u0001\u0010H\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001d\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0\u000f0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J+\u0010s\u001a\b\u0012\u0004\u0012\u00020t0\u00032\b\b\u0001\u0010u\u001a\u00020\f2\b\b\u0001\u0010v\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015JI\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010x\u001a\u00020\u001c2\b\b\u0003\u0010y\u001a\u00020\u001c2\b\b\u0003\u0010z\u001a\u00020\u001c2\b\b\u0003\u0010{\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010|JT\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010~\u001a\u00020\u001c2\b\b\u0001\u0010\u007f\u001a\u00020\f2\b\b\u0003\u0010y\u001a\u00020\u001c2\b\b\u0003\u0010z\u001a\u00020\u001c2\b\b\u0003\u0010{\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0003\u0010\u0080\u0001J#\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010\u00032\b\b\u0001\u0010_\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J0\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\u00032\t\b\u0001\u0010\u0085\u0001\u001a\u00020\u001c2\t\b\u0001\u0010\u0086\u0001\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0003\u0010\u0087\u0001J,\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020e0\u00032\b\b\u0001\u0010H\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J:\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\u00032\t\b\u0001\u0010\u008a\u0001\u001a\u00020\t2\t\b\u0001\u0010\u0086\u0001\u001a\u00020\f2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010&Jd\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010H\u001a\u00020\f2\u000b\b\u0001\u0010\u008d\u0001\u001a\u0004\u0018\u00010\t2\u000b\b\u0001\u0010\u008e\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0001\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\u000b\b\u0001\u0010\u0090\u0001\u001a\u0004\u0018\u00010\t2\u000b\b\u0001\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u001cH§@ø\u0001\u0000¢\u0006\u0003\u0010\u0092\u0001J$\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010\u00032\t\b\u0001\u0010\u0095\u0001\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J-\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\t\b\u0001\u0010\u008a\u0001\u001a\u00020\t2\b\b\u0001\u0010c\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010`J\u001e\u0010\u0097\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0D0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u001f\u0010\u0098\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0099\u00010D0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005Jp\u0010\u009a\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010H\u001a\u00020\f2\t\b\u0001\u0010\u009c\u0001\u001a\u00020\f2\b\b\u0001\u0010-\u001a\u00020\u001c2\t\b\u0001\u0010\u009d\u0001\u001a\u00020\u001c2\t\b\u0001\u0010\u009e\u0001\u001a\u00020\f2\u000b\b\u0001\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u001cH§@ø\u0001\u0000¢\u0006\u0003\u0010 \u0001J$\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030¢\u00010\u00032\b\b\u0001\u0010_\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0003\u0010£\u0001J#\u0010¤\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010\u00032\b\b\u0001\u0010_\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J#\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010\u00032\b\b\u0001\u0010_\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J/\u0010¨\u0001\u001a\t\u0012\u0005\u0012\u00030©\u00010\u00032\t\b\u0001\u0010ª\u0001\u001a\u00020\f2\t\b\u0001\u0010\u0086\u0001\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J*\u0010«\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¬\u00010\u000f0\u00032\t\b\u0001\u0010\u00ad\u0001\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001f\u0010®\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¯\u00010\u000f0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J:\u0010°\u0001\u001a\t\u0012\u0005\u0012\u00030±\u00010\u00032\b\b\u0001\u0010k\u001a\u00020\f2\t\b\u0003\u0010²\u0001\u001a\u00020\f2\t\b\u0003\u0010³\u0001\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0003\u0010´\u0001JG\u0010°\u0001\u001a\t\u0012\u0005\u0012\u00030±\u00010\u00032\b\b\u0001\u0010k\u001a\u00020\f2\t\b\u0003\u0010²\u0001\u001a\u00020\f2\t\b\u0003\u0010³\u0001\u001a\u00020\f2\u000b\b\u0003\u0010µ\u0001\u001a\u0004\u0018\u00010\u001cH§@ø\u0001\u0000¢\u0006\u0003\u0010¶\u0001J.\u0010·\u0001\u001a\t\u0012\u0005\u0012\u00030¸\u00010\u00032\b\b\u0001\u0010k\u001a\u00020\f2\t\b\u0001\u0010¹\u0001\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J:\u0010·\u0001\u001a\t\u0012\u0005\u0012\u00030¸\u00010\u00032\b\b\u0001\u0010k\u001a\u00020\f2\t\b\u0001\u0010²\u0001\u001a\u00020\f2\t\b\u0001\u0010³\u0001\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0003\u0010´\u0001J#\u0010º\u0001\u001a\t\u0012\u0005\u0012\u00030»\u00010\u00032\b\b\u0001\u0010k\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\"\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010_\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011JB\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020,0\u00032\t\b\u0001\u0010¾\u0001\u001a\u00020\u001c2\b\b\u0001\u0010.\u001a\u00020\u001c2\t\b\u0001\u0010¿\u0001\u001a\u00020\u001c2\b\b\u0001\u0010/\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010hJ\u0019\u0010À\u0001\u001a\t\u0012\u0005\u0012\u00030Á\u00010\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005J@\u0010Â\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0099\u00010\u000f0\u00032\t\b\u0001\u0010Ã\u0001\u001a\u00020\f2\b\b\u0001\u0010%\u001a\u00020\f2\t\b\u0001\u0010Ä\u0001\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0003\u0010Å\u0001J,\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010-\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ8\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020,0\u00032\t\b\u0001\u0010È\u0001\u001a\u00020\u001c2\t\b\u0001\u0010É\u0001\u001a\u00020\u001c2\b\b\u0001\u0010-\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u00100J%\u0010Ê\u0001\u001a\t\u0012\u0005\u0012\u00030Ë\u00010\u00032\t\b\u0001\u0010Ì\u0001\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0003\u0010£\u0001J\u0019\u0010Í\u0001\u001a\t\u0012\u0005\u0012\u00030Î\u00010\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0005JK\u0010Ï\u0001\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\t\b\u0001\u0010É\u0001\u001a\u00020\u001c2\b\b\u0001\u0010x\u001a\u00020\u001c2\b\b\u0001\u0010-\u001a\u00020\u001c2\b\b\u0001\u0010/\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010|JV\u0010Ð\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\t\b\u0001\u0010É\u0001\u001a\u00020\u001c2\b\b\u0001\u0010x\u001a\u00020\u001c2\b\b\u0003\u0010y\u001a\u00020\u001c2\b\b\u0003\u0010z\u001a\u00020\u001c2\b\b\u0003\u0010{\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0003\u0010Ñ\u0001J.\u0010Ò\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\t\b\u0001\u0010Ó\u0001\u001a\u00020\t2\t\b\u0001\u0010Ô\u0001\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010!J7\u0010Õ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010x\u001a\u00020\u001c2\b\b\u0001\u0010H\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0003\u0010Ö\u0001J$\u0010×\u0001\u001a\t\u0012\u0005\u0012\u00030Ø\u00010\u00032\t\b\u0001\u0010Ù\u0001\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J6\u0010Ú\u0001\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010.\u001a\u00020\u001c2\b\b\u0001\u0010-\u001a\u00020\u001c2\b\b\u0001\u0010/\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u00100J7\u0010Û\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\t\b\u0001\u0010Ü\u0001\u001a\u00020\u001c2\b\b\u0001\u0010-\u001a\u00020\u001c2\b\b\u0001\u0010/\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ý\u0001"}, d2 = {"Lcom/yalla/yalla/api/service/MainApiService;", "", "activateAccount", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/LoginModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "barboxGetDetail", "Lcom/yalla/yalla/model/TreasureBoxModel;", ContributionFragment.ARG_1, "", "timeId", "boxLevel", "", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "barboxGetResultList", "", "Lcom/yalla/yalla/model/TreasureBoxCarouselInfo;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blockAds", "adId", "sourcePage", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIsFriend", "target", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPhoneRegister", "", "phone", "", "countryCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "conveneBarMember", "conveneIds", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "conveneBarMemberlist", "Lcom/app/base/model/RoomMemberConveneListModel;", "pageIndex", "pageSize", "(JIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "customizeRoomThemeList", "Lcom/yalla/yalla/model/CustomizeThemeModel;", "deleteMembers", "remUserIds", "fbLogin", "Lcom/yalla/yalla/model/LoginListModel;", "deviceId", "accessToken", "country", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "geetGetInfo", "Lcom/yalla/yalla/model/GeetCodeModel;", "phoneNum", "scenes", "(Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArrearsDetails", "Lcom/yalla/yalla/model/ArrearsModel;", "getBubbleShopList", "Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;", "targetId", "getCountryList", "Lcom/yalla/yalla/model/CountryListModel;", "sort", "getCountryOfPwdRoomLimited", "getCustomPrices", "Lcom/yalla/yalla/model/CustomPrices;", "getCustomRoomThemePrices", "getMemberList", "Lcom/app/base/model/RoomMemberListModel;", "", "Lcom/yalla/yalla/model/RoomUserInfoModel;", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhoneCodeSendType", "type", "msgRandomNum", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRedPaperRankList", "Lcom/yalla/yalla/model/RoomKickUser;", "dateSort", "getReportReason", "Lcom/app/base/model/ReportModel;", "viewSourceType", "(ILjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRoomListByCountry", "Lcom/app/base/model/RoomIndexModel;", "countryId", "getRoomListByTag", "labelId", "getRoomThemeAccept", "Lcom/yalla/yalla/model/RoomThemeAccept;", "giveId", "mid", "getRoomThemeGiveCount", "getRoomThemeGivenInfo", "Lcom/yalla/yalla/model/RoomThemeGiveState;", "Lcom/yalla/yalla/model/RoomThemeGiveInfo;", "shopId", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserInfo", "toUserId", "barId", "giftRedPaperRankList", "Lcom/yalla/yalla/model/PacketHistoryModel;", "instagramLogin", "insUserId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLastTime", "Lcom/yalla/yalla/model/LockTimeModel;", "waresId", "medalRankTop", "Lcom/yalla/yalla/model/BadgeRankModel;", "cType", "medalRealtimeRank", "Lcom/yalla/yalla/model/BadgeNews;", "medalRealtimeRankTop", "Lcom/yalla/yalla/model/BadgeBannerModel;", "moraRankList", "Lcom/yalla/yalla/model/GuessData;", "giftId", "moraRankType", "phoneChange", "smsCode", "phoneBrand", "phoneType", "phoneVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phoneSaleLogin", "code", "isActivate", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "purchaseBubble", "Lcom/yalla/yalla/model/StoreRoomChatBubbleBuyModel;", "purchaseCustomImage", "Lcom/yalla/yalla/model/RenewCustomizeTheme;", "themeImgUrl", "themeType", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "redPaperRankList", "renewCustomTheme", "themeId", "isRePurchase", "report", "sourceId", "categoryId", "reasonId", "extendSourceId", "messages", "(ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "roomInfo", "Lcom/app/base/mixedroom/model/RoomConfiguration;", "roonId", "roomThemeEdit", "searchBarRecommend", "searchRecommend", "Lcom/yalla/yalla/common/model/UserInfoModel;", "sendPhoneCode", "Lcom/yalla/yalla/model/SmsCodeModel;", "channel", "sign", "sendType", "geetinfo", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shopPurchase", "Lcom/yalla/yalla/model/VipBuyResultModel;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shopPurchase1", "Lcom/yalla/yalla/model/LockBuyModel;", "shopPurchaseTheme", "Lcom/yalla/yalla/model/ThemeBoughtModel;", "shopRoomThemeList", "Lcom/yalla/yalla/model/MyThemeListModel;", "region", "shopRoomThemeListByType", "Lcom/yalla/yalla/model/ThemeModel;", "themeTypeId", "shopRoomThemeListTop", "Lcom/yalla/yalla/model/ThemeListModel;", "shopUnitPrice", "Lcom/yalla/yalla/model/PremiumShopModel;", "payType", "vipLevel", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "appChannelStr", "(IIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shopUnitPrice1", "Lcom/yalla/yalla/model/LockShopModel;", "paytype", "shopUserbuy", "Lcom/yalla/yalla/model/PremiumTimeModel;", "toggleBubble", "twitterLogin", "deviceTd", "authTokenSecret", "userCompanionsInRoomList", "Lcom/yalla/yalla/model/FriendInRoomModel;", "userCompanionsList", "pageindex", "timestr", "(IIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userDevcieRegister", "userLogin", "account", "password", "userMedalList", "Lcom/yalla/yalla/model/BadgeModel;", "touristId", "userPrivacySlt", "Lcom/yalla/yalla/model/AccountPrivacy;", "userSmRegister", "userSmRetrievePwd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userUnblockAppeal", "userId", "reason", "verCode", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "vipPrivilege", "Lcom/yalla/yalla/model/VipPrivilegeModel;", "vipShopId", "weChatLogin", "yallaChatLogin", "appCode", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MainApiService {

    public static final class OooO00o {
        public static /* synthetic */ Object OooO0OO(MainApiService mainApiService, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i, Object obj) {
            o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
            return mainApiService.phoneChange(str, str2, o0Oo0oo.OooO0O0(), o0Oo0oo.OooO0OO(), o0Oo0oo.OooO0Oo(), continuation);
        }

        public static /* synthetic */ Object OooO0Oo(MainApiService mainApiService, String str, String str2, int i, String str3, String str4, String str5, Continuation continuation, int i2, Object obj) {
            o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
            return mainApiService.phoneSaleLogin(str, str2, i, o0Oo0oo.OooO0O0(), o0Oo0oo.OooO0OO(), o0Oo0oo.OooO0Oo(), continuation);
        }

        public static /* synthetic */ Object OooO0oO(MainApiService mainApiService, String str, String str2, String str3, String str4, String str5, String str6, Continuation continuation, int i, Object obj) {
            o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
            return mainApiService.userSmRetrievePwd(str, str2, str3, o0Oo0oo.OooO0O0(), o0Oo0oo.OooO0OO(), o0Oo0oo.OooO0Oo(), continuation);
        }
    }

    @Headers({"Abnormal:true"})
    @POST("/Webservers/User/ActivateAccount")
    @Nullable
    Object activateAccount(@NotNull Continuation<? super ApiResult<LoginModel>> continuation);

    @GET("Webservers/barbox/GetDetail")
    @Nullable
    Object barboxGetDetail(@Query(ContributionFragment.ARG_1) long j, @Query("timeId") long j2, @Query("boxLevel") int i, @NotNull Continuation<? super ApiResult<TreasureBoxModel>> continuation);

    @GET("Webservers/barbox/GetResultList")
    @Nullable
    Object barboxGetResultList(@Query("boxLevel") int i, @NotNull Continuation<? super ApiResult<List<TreasureBoxCarouselInfo>>> continuation);

    @GET("/Webservers/Bar/AdvertiBlockIns")
    @Nullable
    Object blockAds(@Query("adid") int i, @Query("sourcepage") int i2, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @GET("/Webservers/Messages/CheckIsFriend")
    @Nullable
    Object checkIsFriend(@Query("touserid") long j, @NotNull Continuation<? super ApiResult<Integer>> continuation);

    @GET("/Webservers/User/CheckPhoneRegister")
    @Nullable
    Object checkPhoneRegister(@NotNull @Query("phone") String str, @NotNull @Query("countrycode") String str2, @NotNull Continuation<? super ApiResult<Boolean>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Bar/ConveneBarMember")
    @Nullable
    Object conveneBarMember(@Field("barid") long j, @Field("conveneIds") @NotNull String str, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @GET("/Webservers/Bar/ConveneBarMemberlist")
    @Nullable
    Object conveneBarMemberlist(@Query("barid") long j, @Query("pageindex") int i, @Query("pagesize") int i2, @NotNull Continuation<? super ApiResult<RoomMemberConveneListModel>> continuation);

    @GET("Webservers/shop/UserCustomRoomThemes")
    @Nullable
    Object customizeRoomThemeList(@NotNull Continuation<? super ApiResult<List<CustomizeThemeModel>>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Bar/BatchRemBarMembers")
    @Nullable
    Object deleteMembers(@Field("barid") long j, @Field("remUserIds") @NotNull String str, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/User/FbLogin")
    @Nullable
    Object fbLogin(@NotNull @Query("deviceid") String str, @NotNull @Query("accesstoken") String str2, @NotNull @Query("country") String str3, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation);

    @GET("Webservers/geet/getinfo")
    @Nullable
    Object geetGetInfo(@NotNull @Query("PhoneNum") String str, @Nullable @Query("scenes") Integer num, @NotNull Continuation<? super ApiResult<GeetCodeModel>> continuation);

    @GET("Webservers/User/UserDebtDetails")
    @Nullable
    Object getArrearsDetails(@Query("pageindex") int i, @Query("pagesize") int i2, @NotNull Continuation<? super ApiResult<ArrearsModel>> continuation);

    @GET("Webservers/Shop/GetBubbleShopList")
    @Nullable
    Object getBubbleShopList(@Query("getType") int i, @NotNull Continuation<? super ApiResult<List<StoreRoomChatBubbleModel>>> continuation);

    @Headers({"Abnormal:true"})
    @GET("Webservers/Bar/CountryHotSort")
    @Nullable
    Object getCountryList(@Query("sort") int i, @NotNull Continuation<? super ApiResult<CountryListModel>> continuation);

    @GET("/Webservers/Bar/GetCountryOfPwdRoomLimited")
    @Nullable
    Object getCountryOfPwdRoomLimited(@NotNull Continuation<? super ApiResult<List<Integer>>> continuation);

    @GET("Webservers/shop/GetCustomPrices")
    @Nullable
    Object getCustomPrices(@NotNull Continuation<? super ApiResult<CustomPrices>> continuation);

    @GET("Webservers/shop/GetCustomRoomThemePrices")
    @Nullable
    Object getCustomRoomThemePrices(@NotNull Continuation<? super ApiResult<List<CustomPrices>>> continuation);

    @GET("/Webservers/Bar/BarMemberlist")
    @Nullable
    Object getMemberList(@Query("barid") long j, @Query("pageindex") int i, @NotNull Continuation<? super ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/User/GetPhoneCodeSendType")
    @Nullable
    Object getPhoneCodeSendType(@Field("type") int i, @Field("msgRandomNum") @NotNull String str, @NotNull Continuation<? super ApiResult<Integer>> continuation);

    @GET("/Webservers/Bar/KickOutRoomList")
    @Nullable
    Object getRedPaperRankList(@Query("roomid") long j, @Query("datesort") long j2, @Query("pageindex") int i, @NotNull Continuation<? super ApiResult<List<RoomKickUser>>> continuation);

    @GET("/Webservers/Report/GetReason")
    @Nullable
    Object getReportReason(@Query("type") int i, @Nullable @Query("viewSourceType") Integer num, @NotNull Continuation<? super ApiResult<List<ReportModel>>> continuation);

    @GET("/Webservers/Bar/BarHomePage")
    @Nullable
    Object getRoomListByCountry(@Query("pageindex") int i, @Query("countryId") int i2, @NotNull Continuation<? super ApiResult<List<RoomIndexModel>>> continuation);

    @GET("/Webservers/Bar/BarHomePage")
    @Nullable
    Object getRoomListByTag(@Query("pageindex") int i, @Query("labelId") int i2, @NotNull Continuation<? super ApiResult<List<RoomIndexModel>>> continuation);

    @FormUrlEncoded
    @POST("Webservers/Shop/RoomThemeAccept")
    @Nullable
    Object getRoomThemeAccept(@Field("giveId") long j, @Field("msgId") @NotNull String str, @NotNull Continuation<? super ApiResult<RoomThemeAccept>> continuation);

    @GET("Webservers/shop/GetRoomThemeGiveCount")
    @Nullable
    Object getRoomThemeGiveCount(@NotNull Continuation<? super ApiResult<Integer>> continuation);

    @GET("Webservers/Shop/GetRoomThemeGiveInfo")
    @Nullable
    Object getRoomThemeGivenInfo(@Query("toUserId") long j, @Query("shopId") long j2, @NotNull Continuation<? super ApiResult<RoomThemeGiveInfo>> continuation);

    @GET("Webservers/Shop/GetRoomThemeGiveStatus")
    @Nullable
    Object getRoomThemeGivenInfo(@Query("giveId") long j, @NotNull Continuation<? super ApiResult<RoomThemeGiveState>> continuation);

    @GET("Webservers/Bar/GetUserInfo")
    @Nullable
    Object getUserInfo(@Query("touserid") long j, @Query("barid") long j2, @NotNull Continuation<? super ApiResult<RoomUserInfoModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Bar/GiftRedPaperRankList")
    @Nullable
    Object giftRedPaperRankList(@Query("type") int i, @Query("pageindex") int i2, @NotNull Continuation<? super ApiResult<PacketHistoryModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/User/InstagramLogin")
    @Nullable
    Object instagramLogin(@NotNull @Query("accesstoken") String str, @NotNull @Query("insUserid") String str2, @NotNull @Query("deviceid") String str3, @NotNull @Query("country") String str4, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation);

    @GET("/Webservers/Shop/ShopUserbuy")
    @Nullable
    Object loadLastTime(@Query("waresid") int i, @NotNull Continuation<? super ApiResult<LockTimeModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("Webservers/Medal/MedalRankTop")
    @Nullable
    Object medalRankTop(@NotNull @Query("type") String str, @NotNull @Query("ctype") String str2, @NotNull Continuation<? super ApiResult<BadgeRankModel>> continuation);

    @GET("Webservers/Medal/MedalRealtimeRank")
    @Nullable
    Object medalRealtimeRank(@Query("type") int i, @NotNull Continuation<? super ApiResult<List<BadgeNews>>> continuation);

    @GET("Webservers/Medal/MedalRealtimeRankTop")
    @Nullable
    Object medalRealtimeRankTop(@NotNull Continuation<? super ApiResult<List<BadgeBannerModel>>> continuation);

    @FormUrlEncoded
    @POST("Webservers/RankingList/MoraRankList")
    @Nullable
    Object moraRankList(@Field("giftId") int i, @Field("moraRankType") int i2, @NotNull Continuation<? super ApiResult<GuessData>> continuation);

    @GET("/Webservers/User/PhoneChange")
    @Nullable
    Object phoneChange(@NotNull @Query("phone") String str, @NotNull @Query("code") String str2, @NotNull @Query("phoneBrand") String str3, @NotNull @Query("phoneType") String str4, @NotNull @Query("phoneVersion") String str5, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Abnormal:true"})
    @POST("/Webservers/User/PhoneSaleLogin")
    Object phoneSaleLogin(@Field("phone") @NotNull String str, @Field("code") @NotNull String str2, @Field("isActivate") int i, @Field("phoneBrand") @NotNull String str3, @Field("phoneType") @NotNull String str4, @Field("phoneVersion") @NotNull String str5, @NotNull Continuation<? super ApiResult<LoginModel>> continuation);

    @FormUrlEncoded
    @POST("Webservers/Shop/PurchaseBubble")
    @Nullable
    Object purchaseBubble(@Field("shopId") int i, @NotNull Continuation<? super ApiResult<StoreRoomChatBubbleBuyModel>> continuation);

    @FormUrlEncoded
    @POST("Webservers/shop/CustomRoomTheme")
    @Nullable
    Object purchaseCustomImage(@Field("themeImgUrl") @NotNull String str, @Field("themeType") int i, @NotNull Continuation<? super ApiResult<RenewCustomizeTheme>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Bar/RedPaperRankList")
    @Nullable
    Object redPaperRankList(@Query("type") int i, @Query("pageindex") int i2, @NotNull Continuation<? super ApiResult<PacketHistoryModel>> continuation);

    @FormUrlEncoded
    @POST("Webservers/shop/RenewCustomRoomTheme")
    @Nullable
    Object renewCustomTheme(@Field("themeId") long j, @Field("themeType") int i, @Field("isRePurchase") int i2, @NotNull Continuation<? super ApiResult<RenewCustomizeTheme>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Report/Add")
    @Nullable
    Object report(@Field("type") int i, @Field("sourceId") @Nullable Long l, @Field("catagoryId") @Nullable Integer num, @Field("reasonId") @Nullable Integer num2, @Field("extendSourceId") @Nullable Long l2, @Field("messages") @Nullable String str, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @GET("/Webservers/Bar/RoomInfo")
    @Nullable
    Object roomInfo(@Query("barid") long j, @NotNull Continuation<? super ApiResult<RoomConfiguration>> continuation);

    @GET("/Webservers/Bar/RoomThemeEdit")
    @Nullable
    Object roomThemeEdit(@Query("themeId") long j, @Query("barid") long j2, @NotNull Continuation<? super ApiResult<String>> continuation);

    @GET("/Webservers/Bar/SearchBarRecommend")
    @Nullable
    Object searchBarRecommend(@NotNull Continuation<? super ApiResult<List<RoomIndexModel>>> continuation);

    @GET("/Webservers/Messages/SearchRecommend")
    @Nullable
    Object searchRecommend(@NotNull Continuation<? super ApiResult<List<UserInfoModel>>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/User/SendPhoneCode")
    @Nullable
    Object sendPhoneCode(@Field("phone") @NotNull String str, @Field("countrycode") @NotNull String str2, @Field("type") int i, @Field("channel") int i2, @Field("deviceid") @NotNull String str3, @Field("sign") @NotNull String str4, @Field("sendType") int i3, @Field("geetinfo") @Nullable String str5, @NotNull Continuation<? super ApiResult<SmsCodeModel>> continuation);

    @GET("/Webservers/Shop/ShopPurchase")
    @Nullable
    Object shopPurchase(@NotNull @Query("shopid") String str, @NotNull Continuation<? super ApiResult<VipBuyResultModel>> continuation);

    @GET("/Webservers/Shop/ShopPurchase")
    @Nullable
    Object shopPurchase1(@Query("shopid") long j, @NotNull Continuation<? super ApiResult<LockBuyModel>> continuation);

    @GET("/Webservers/Shop/ShopPurchaseTheme")
    @Nullable
    Object shopPurchaseTheme(@Query("shopid") long j, @NotNull Continuation<? super ApiResult<ThemeBoughtModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Shop/ShopRoomThemeList")
    @Nullable
    Object shopRoomThemeList(@Query("region") int i, @Query("themeType") int i2, @NotNull Continuation<? super ApiResult<MyThemeListModel>> continuation);

    @GET("/Webservers/Shop/ShopRoomThemeListByType")
    @Nullable
    Object shopRoomThemeListByType(@Query("themeTypeId") int i, @NotNull Continuation<? super ApiResult<List<ThemeModel>>> continuation);

    @GET("/Webservers/Shop/ShopRoomThemeListTop")
    @Nullable
    Object shopRoomThemeListTop(@NotNull Continuation<? super ApiResult<List<ThemeListModel>>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Shop/ShopUnitPrice")
    @Nullable
    Object shopUnitPrice(@Query("waresid") int i, @Query("paytype") int i2, @Query("viplevel") int i3, @Nullable @Query("appChannelStr") String str, @NotNull Continuation<? super ApiResult<PremiumShopModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Shop/ShopUnitPrice")
    @Nullable
    Object shopUnitPrice(@Query("waresid") int i, @Query("paytype") int i2, @Query("viplevel") int i3, @NotNull Continuation<? super ApiResult<PremiumShopModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Shop/ShopUnitPrice")
    @Nullable
    Object shopUnitPrice1(@Query("waresid") int i, @Query("paytype") int i2, @Query("viplevel") int i3, @NotNull Continuation<? super ApiResult<LockShopModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Shop/ShopUnitPrice")
    @Nullable
    Object shopUnitPrice1(@Query("waresid") int i, @Query("paytype") int i2, @NotNull Continuation<? super ApiResult<LockShopModel>> continuation);

    @GET("/Webservers/Shop/ShopUserbuy")
    @Nullable
    Object shopUserbuy(@Query("waresid") int i, @NotNull Continuation<? super ApiResult<PremiumTimeModel>> continuation);

    @FormUrlEncoded
    @POST("Webservers/User/ToggleBubble")
    @Nullable
    Object toggleBubble(@Field("shopId") int i, @NotNull Continuation<? super ApiResult<String>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/User/TwitterLogin")
    @Nullable
    Object twitterLogin(@NotNull @Query("deviceid") String str, @NotNull @Query("authtoken") String str2, @NotNull @Query("authtokensecret") String str3, @NotNull @Query("country") String str4, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Messages/UserCompanionsInRoomList")
    @Nullable
    Object userCompanionsInRoomList(@NotNull Continuation<? super ApiResult<FriendInRoomModel>> continuation);

    @GET("/Webservers/Messages/UserCompanionsList")
    @Nullable
    Object userCompanionsList(@Query("pageindex") int i, @Query("pagesize") int i2, @Query("timestr") long j, @NotNull Continuation<? super ApiResult<List<UserInfoModel>>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/User/UserDevcieRegister")
    @Nullable
    Object userDevcieRegister(@NotNull @Query(DeviceRequestsHelper.DEVICE_INFO_DEVICE) String str, @NotNull @Query("countryCode") String str2, @NotNull Continuation<? super ApiResult<LoginModel>> continuation);

    @Nullable
    @FormUrlEncoded
    @Headers({"Abnormal:true"})
    @POST("/Webservers/User/Userlogin")
    Object userLogin(@Field("account") @NotNull String str, @Field("password") @NotNull String str2, @Field("deviceid") @NotNull String str3, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/Medal/UserMedalList")
    @Nullable
    Object userMedalList(@NotNull @Query("touserid") String str, @NotNull Continuation<? super ApiResult<BadgeModel>> continuation);

    @GET("Webservers/User/UserPrivacySlt")
    @Nullable
    Object userPrivacySlt(@NotNull Continuation<? super ApiResult<AccountPrivacy>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/User/UserSmRegister")
    @Nullable
    Object userSmRegister(@NotNull @Query("phone") String str, @NotNull @Query("password") String str2, @NotNull @Query("code") String str3, @NotNull @Query("deviceid") String str4, @NotNull @Query("country") String str5, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation);

    @GET("/Webservers/User/UserSmRetrievePwd")
    @Nullable
    Object userSmRetrievePwd(@NotNull @Query("phone") String str, @NotNull @Query("password") String str2, @NotNull @Query("code") String str3, @NotNull @Query("phoneBrand") String str4, @NotNull @Query("phoneType") String str5, @NotNull @Query("phoneVersion") String str6, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/User/UserUnblockAppeal")
    @Nullable
    Object userUnblockAppeal(@Field("AppealUserId") long j, @Field("reason") @NotNull String str, @NotNull Continuation<? super ApiResult<String>> continuation);

    @GET("/Webservers/User/VerCode")
    @Nullable
    Object verCode(@NotNull @Query("phone") String str, @NotNull @Query("code") String str2, @Query("type") int i, @NotNull Continuation<? super ApiResult<Object>> continuation);

    @GET("/Webservers/User/VipPrivilege")
    @Nullable
    Object vipPrivilege(@Query("shopid") int i, @NotNull Continuation<? super ApiResult<VipPrivilegeModel>> continuation);

    @Headers({"Abnormal:true"})
    @GET("/Webservers/User/WeChatLogin")
    @Nullable
    Object weChatLogin(@NotNull @Query("code") String str, @NotNull @Query("deviceid") String str2, @NotNull @Query("country") String str3, @NotNull Continuation<? super ApiResult<LoginListModel>> continuation);

    @FormUrlEncoded
    @POST("/Webservers/Account/YallaChatLogin")
    @Nullable
    Object yallaChatLogin(@Field("code") @NotNull String str, @Field("deviceid") @NotNull String str2, @Field("country") @NotNull String str3, @NotNull Continuation<? super ApiResult<LoginModel>> continuation);
}
