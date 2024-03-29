#
# Copyright (C) 2015 The CyanogenMod Project
#               2017-2021 The LineageOS Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

# Local overlays
DEVICE_PACKAGE_OVERLAYS += device/htc/m8/overlay

# Get non-open-source specific aspects
$(call inherit-product, vendor/htc/m8/m8-vendor.mk)

# Inherit from m8-common
$(call inherit-product, device/htc/m8-common/m8-common.mk)

# Soong namespaces
PRODUCT_SOONG_NAMESPACES += \
    $(LOCAL_PATH)
