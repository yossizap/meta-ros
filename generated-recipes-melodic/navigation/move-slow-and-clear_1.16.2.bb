# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "move_slow_and_clear"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://wiki.ros.org/move_slow_and_clear"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "navigation"
ROS_BPN = "move_slow_and_clear"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    costmap-2d \
    geometry-msgs \
    nav-core \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-2d \
    geometry-msgs \
    nav-core \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-2d \
    geometry-msgs \
    nav-core \
    pluginlib \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/move_slow_and_clear/1.16.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "02067cdc26b796885f04dcb30d136359"
SRC_URI[sha256sum] = "03d382b561c972861428737b3804a666bc1e8f20a962e160049cda6202c4bbd4"
S = "${WORKDIR}/navigation-release-release-melodic-move_slow_and_clear-1.16.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('navigation', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('navigation', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation/navigation_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation/navigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}