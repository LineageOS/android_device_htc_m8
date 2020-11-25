/*
   Copyright (c) 2013, The Linux Foundation. All rights reserved.

   Redistribution and use in source and binary forms, with or without
   modification, are permitted provided that the following conditions are
   met:
    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above
      copyright notice, this list of conditions and the following
      disclaimer in the documentation and/or other materials provided
      with the distribution.
    * Neither the name of The Linux Foundation nor the names of its
      contributors may be used to endorse or promote products derived
      from this software without specific prior written permission.

   THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED
   WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
   MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT
   ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
   BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
   CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
   SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
   BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
   WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
   OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
   IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

#include <android-base/logging.h>
#include <android-base/properties.h>

#include "init_msm8974.h"
#include "vendor_init.h"

using android::base::GetProperty;

void common_properties()
{
    property_override("rild.libargs", "-d /dev/smd0");
    property_override("ro.ril.hsdpa.category", "14");
    property_override("ro.ril.hsxpa", "4");
    property_override("ro.ril.disable.cpc", "1");
}

void cdma_properties(char const default_cdma_sub[], char const default_network[])
{
    property_override("ro.telephony.default_cdma_sub", default_cdma_sub);
    property_override("ro.telephony.default_network", default_network);
    property_override("telephony.lteOnCdmaDevice", "1");
    property_override("ro.ril.enable.sdr", "0");
    property_override("persist.radio.snapshot_enabled", "1");
    property_override("persist.radio.snapshot_timer", "22");
}

void gsm_properties(char const default_network[])
{
    property_override("ro.telephony.default_network", default_network);
    property_override("telephony.lteOnGsmDevice", "1");
    property_override("ro.ril.radio.svn", "1");
}

void vendor_load_properties()
{
    std::string bootmid;
    std::string device;

    bootmid = GetProperty("ro.boot.mid", "");
    if (bootmid == "0P6B20000") {
        /* m8vzw (m8wl) */
        common_properties();
        cdma_properties("0", "10");
        property_override("ro.build.description", "6.21.605.3 CL708002 release-keys");
        property_override("ro.build.product", "htc_m8wl");
        property_override("ro.com.google.clientidbase", "android-verizon");
        property_override("ro.ril.vzw.feature", "1");
        property_override("ro.ril.oem.ecclist", "911,*911,#911");
        property_override("ro.ril.enable.a52", "0");
        property_override("ro.ril.enable.a53", "1");
        property_override("ro.ril.enable.dtm", "0");
        property_override("ro.ril.enable.gea3", "1");
        property_override("ro.ril.enable.r8fd", "1");
        property_override("ro.ril.disable.fd.plmn.prefix", "23402,23410,23411,23420");
        property_override("ro.ril.fast.dormancy.cdma.rule", "0");
        property_override("ro.ril.gprsclass", "12");
        property_override("ro.ril.att.feature", "0");
        property_override("ro.ril.enable.managed.roaming", "1");
        property_override("ro.ril.oem.show.act", "0");
        property_override("ro.ril.pdpnumber.policy.roaming", "3");
        property_override("ro.ril.set.mtusize", "1428");
        property_override("ro.ril.air.enabled", "0");
        property_override("ro.ril.wp.feature", "1");
        property_override("ro.cdma.data_retry_config", "max_retries=infinite,0,0,60000,120000,480000,900000");
        property_override("ro.gsm.data_retry_config", "max_retries=infinite,0,0,60000,120000,480000,900000");
        property_override("ro.gsm.2nd_data_retry_config", "max_retries=infinite,0,0,60000,120000,480000,900000");
        property_override("ro.ril.gsm.to.lte.blind.redir", "0");
        property_override("ro.config.svlte1x", "true");
        property_override("ro.telephony.get_imsi_from_sim", "true");
        property_override("rild.libpath", "/vendor/lib/libril_vzw-qc-qmi-1.so");
        set_ro_build_fingerprint_prop("htc/HTCOneM8vzw/htc_m8wl:6.0/MRA58K/708002.3:user/release-keys");
        set_ro_product_prop("device", "htc_m8wl");
        set_ro_product_prop("model", "m8wl");
    } else if (bootmid == "0P6B70000") {
        /* m8spr (m8whl) */
        common_properties();
        cdma_properties("1", "8");
        property_override("ro.build.description", "6.20.651.3 CL682910 release-keys");
        property_override("ro.build.product", "htc_m8whl");
        property_override("ro.ril.disable.fd.plmn.prefix", "23402,23410,23411,23420,23594,27202,27205");
        property_override("ro.ril.oem.ecclist", "911");
        property_override("ro.ril.set.mtusize", "1422");
        property_override("ro.cdma.home.operator.numeric", "310120");
        property_override("gsm.sim.operator.numeric", "310120");
        property_override("gsm.operator.numeric", "310120");
        property_override("ro.cdma.home.operator.alpha", "Sprint");
        property_override("gsm.sim.operator.alpha", "Sprint");
        property_override("gsm.operator.alpha", "310120");
        property_override("rild.libpath", "/vendor/lib/libril_spr-qc-qmi-1.so");
        set_ro_build_fingerprint_prop("htc/sprint_wwe/htc_m8whl:6.0/MRA58K/682910.3:user/release-keys");
        set_ro_product_prop("device", "htc_m8whl");
        set_ro_product_prop("model", "m8whl");
    } else {
        /* m8 */
        common_properties();
        gsm_properties("9");
        property_override("ro.build.description", "5.07.1700.6 CL648564 release-keys");
        property_override("ro.build.product", "htc_m8");
        set_ro_build_fingerprint_prop("htc/m8_google/htc_m8:6.0/MRA58K.H6/648564:user/release-keys");
        set_ro_product_prop("device", "htc_m8");
        set_ro_product_prop("model", "m8");
    }

    device = GetProperty("ro.product.device", "");
    LOG(ERROR) << "Found bootmid '" << bootmid.c_str() << "' setting build properties for '" << device.c_str() << "' device\n";
}
