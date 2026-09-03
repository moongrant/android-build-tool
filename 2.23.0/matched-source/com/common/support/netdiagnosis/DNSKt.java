package com.common.support.netdiagnosis;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import com.facebook.appevents.integrity.IntegrityManager;
import com.qiniu.android.collect.ReportItem;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"dns", "", "", "context", "Landroid/content/Context;", "getDnsFromCommand", "getDnsFromConnectionManager", "hostResolution", "", ReportItem.RequestKeyHost, "addressType", "Lcom/common/support/netdiagnosis/AddressType;", "isDesiredType", "", "targetAddressType", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Ljava/net/InetAddress;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class DNSKt {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressType.values().length];
            iArr[AddressType.ALL.ordinal()] = 1;
            iArr[AddressType.IPV4.ordinal()] = 2;
            iArr[AddressType.IPV6.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Set<String> dns(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Set<String> dnsFromCommand = getDnsFromCommand();
        return dnsFromCommand.isEmpty() ? getDnsFromConnectionManager(context) : dnsFromCommand;
    }

    private static final Set<String> getDnsFromCommand() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream()));
            while (true) {
                String line = lineNumberReader.readLine();
                if (line == null) {
                    break;
                }
                Intrinsics.checkNotNull(line);
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, "]: [", 0, false, 6, (Object) null);
                if (iIndexOf$default != -1) {
                    String strSubstring = line.substring(1, iIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    String strSubstring2 = line.substring(iIndexOf$default + 4, line.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (StringsKt.OooOO0O(strSubstring, ".dns") || StringsKt.OooOO0O(strSubstring, ".dns1") || StringsKt.OooOO0O(strSubstring, ".dns2") || StringsKt.OooOO0O(strSubstring, ".dns3") || StringsKt.OooOO0O(strSubstring, ".dns4")) {
                        InetAddress byName = InetAddress.getByName(strSubstring2);
                        if (byName != null) {
                            String hostAddress = byName.getHostAddress();
                            Intrinsics.checkNotNullExpressionValue(hostAddress, "ip.hostAddress");
                            if (!(hostAddress.length() == 0)) {
                                linkedHashSet.add(hostAddress);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linkedHashSet;
    }

    private static final Set<String> getDnsFromConnectionManager(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        LinkProperties linkProperties;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object systemService = context.getSystemService("connectivity");
        if ((systemService instanceof ConnectivityManager) && (activeNetworkInfo = (connectivityManager = (ConnectivityManager) systemService).getActiveNetworkInfo()) != null) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks, "connectivityManager.allNetworks");
            int length = allNetworks.length;
            int i = 0;
            while (i < length) {
                Network network = allNetworks[i];
                i++;
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && networkInfo.getType() == activeNetworkInfo.getType() && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
                    Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
                    while (it.hasNext()) {
                        String hostAddress = it.next().getHostAddress();
                        Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
                        linkedHashSet.add(hostAddress);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static final List<String> hostResolution(@NotNull String host, @NotNull AddressType addressType) {
        int length;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        ArrayList arrayList = new ArrayList();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(host);
            if (allByName != null) {
                int i = 0;
                if ((!(allByName.length == 0)) && (length = allByName.length - 1) >= 0) {
                    while (true) {
                        int i2 = i + 1;
                        InetAddress address = allByName[i];
                        Intrinsics.checkNotNullExpressionValue(address, "address");
                        if (isDesiredType(addressType, address)) {
                            String hostAddress = address.getHostAddress();
                            Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
                            arrayList.add(hostAddress);
                        }
                        if (i2 > length) {
                            break;
                        }
                        i = i2;
                    }
                }
            }
            return arrayList;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return arrayList;
        }
    }

    public static /* synthetic */ List hostResolution$default(String str, AddressType addressType, int i, Object obj) {
        if ((i & 2) != 0) {
            addressType = AddressType.IPV4;
        }
        return hostResolution(str, addressType);
    }

    private static final boolean isDesiredType(AddressType addressType, InetAddress inetAddress) {
        int i = WhenMappings.$EnumSwitchMapping$0[addressType.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return inetAddress instanceof Inet4Address;
        }
        if (i == 3) {
            return inetAddress instanceof Inet6Address;
        }
        throw new NoWhenBranchMatchedException();
    }
}
